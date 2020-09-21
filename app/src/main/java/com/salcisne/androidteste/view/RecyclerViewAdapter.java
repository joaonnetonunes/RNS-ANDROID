package com.salcisne.androidteste.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.salcisne.androidteste.R;
import com.salcisne.androidteste.databinding.ProdutoItemBinding;
import com.salcisne.androidteste.model.Armazem;
import com.salcisne.androidteste.model.Produto;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final List<Armazem> armazems;

    public RecyclerViewAdapter(List<Armazem> armazems) {
        this.armazems = armazems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder((ProdutoItemBinding) DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.produto_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final Armazem armazem = armazems.get(position);
        holder.bindView(armazem);
    }

    @Override
    public int getItemCount() {
        return armazems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ProdutoItemBinding binding;

        ViewHolder(ProdutoItemBinding binding) {
            super(binding.getRoot());

            this.binding = binding;

        }

        void bindView(final Armazem armazem) {

            binding.setArmazem(armazem);
            binding.executePendingBindings();
        }


    }
}
