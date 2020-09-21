package com.salcisne.androidteste.service;

import androidx.lifecycle.MutableLiveData;

import com.salcisne.androidteste.model.EndpointProduto;
import com.salcisne.androidteste.model.Produto;
import com.salcisne.androidteste.service.api.ApiModule;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EndpointProdutoService implements IEndpointProdutoService {
    @Override
    public MutableLiveData<List<EndpointProduto>> getListaProdutos() {
        final MutableLiveData<List<EndpointProduto>> listaProdutosLiveData = new MutableLiveData<>();
        ApiModule.getApi().getProdutos().enqueue(new Callback<List<EndpointProduto>>() {
            @Override
            public void onResponse(Call<List<EndpointProduto>> call, Response<List<EndpointProduto>> response) {
                listaProdutosLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<EndpointProduto>> call, Throwable t) {

            }
        });
        return listaProdutosLiveData;
    }
}
