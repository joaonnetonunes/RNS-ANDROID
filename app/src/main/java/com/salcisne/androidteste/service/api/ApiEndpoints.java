package com.salcisne.androidteste.service.api;

import com.salcisne.androidteste.model.Armazem;
import com.salcisne.androidteste.model.EndpointProduto;
import com.salcisne.androidteste.model.Filial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoints {
    @GET("produtos/find-all")
    Call<List<EndpointProduto>> getProdutos();

    @GET("armazem/find-all")
    Call<List<Armazem>> getArmazens();

    @GET("filial/find-all")
    Call<List<Filial>> getFiliais();
}