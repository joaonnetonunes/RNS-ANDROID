package com.salcisne.androidteste.service;

import androidx.lifecycle.MutableLiveData;

import com.salcisne.androidteste.model.Filial;

import java.util.List;

public interface IFilialService {
    MutableLiveData<List<Filial>> getListaFiliais();
}
