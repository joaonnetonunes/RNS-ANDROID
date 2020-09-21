package com.salcisne.androidteste.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.salcisne.androidteste.model.Armazem;
import com.salcisne.androidteste.service.ArmazemService;
import com.salcisne.androidteste.service.IArmazemService;

import java.util.List;

public class ProdutoViewModel extends ViewModel {


    private IArmazemService armazemService = new ArmazemService();

    private MutableLiveData<List<Armazem>> listaArmazens = armazemService.getListaArmazens();

    public MutableLiveData<List<Armazem>> getListaArmazens() {
        return listaArmazens;
    }
}
