package com.salcisne.androidteste.service;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.salcisne.androidteste.model.Armazem;
import com.salcisne.androidteste.service.api.ApiModule;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArmazemService implements IArmazemService {
    @Override
    public MutableLiveData<List<Armazem>> getListaArmazens() {
        final MutableLiveData<List<Armazem>> listaDeArmazemLiveData = new MutableLiveData<>();
        ApiModule.getApi().getArmazens().enqueue(new Callback<List<Armazem>>() {
            @Override
            public void onResponse(Call<List<Armazem>> call, Response<List<Armazem>> response) {

                listaDeArmazemLiveData.setValue(response.body());

                assert response.body() != null;
                Log.i("--->", response.body().toString());
            }

            @Override
            public void onFailure(Call<List<Armazem>> call, Throwable t) {

            }
        });

        return listaDeArmazemLiveData;
    }
}
