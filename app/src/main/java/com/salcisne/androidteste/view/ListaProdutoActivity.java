package com.salcisne.androidteste.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.salcisne.androidteste.R;
import com.salcisne.androidteste.model.Armazem;
import com.salcisne.androidteste.viewmodel.ProdutoViewModel;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutoActivity extends AppCompatActivity {

    private ProdutoViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViewModel();
        setUpRecyclerView();
    }

    private void setupViewModel() {
        viewModel = new ViewModelProvider(this).get(ProdutoViewModel.class);

    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerViewProdutos);
        recyclerView.setAdapter(new RecyclerViewAdapter(getArmazemList()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private List<Armazem> getArmazemList() {

       final List<Armazem> armazems = new ArrayList<>();

        viewModel.getListaArmazens().observe(this, new Observer<List<Armazem>>() {

            @Override
            public void onChanged(List<Armazem> armazemList) {
                armazems.addAll(armazemList);
            }
        });

        return armazems;
    }
}
