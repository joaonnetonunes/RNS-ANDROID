package com.salcisne.androidteste.service;

import androidx.lifecycle.MutableLiveData;

import com.salcisne.androidteste.model.Filial;
import com.salcisne.androidteste.service.api.ApiModule;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilialService implements IFilialService {
    @Override
    public MutableLiveData<List<Filial>> getListaFiliais() {
        final MutableLiveData<List<Filial>> listaFiliaisLiveData = new MutableLiveData<>();
        ApiModule.getApi().getFiliais().enqueue(new Callback<List<Filial>>() {
            @Override
            public void onResponse(Call<List<Filial>> call, Response<List<Filial>> response) {
                listaFiliaisLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Filial>> call, Throwable t) {

            }
        });

        return listaFiliaisLiveData;
    }
}
