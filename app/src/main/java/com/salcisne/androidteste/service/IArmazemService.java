package com.salcisne.androidteste.service;

import androidx.lifecycle.MutableLiveData;

import com.salcisne.androidteste.model.Armazem;

import java.util.List;

public interface IArmazemService {
    MutableLiveData<List<Armazem>> getListaArmazens();
}
