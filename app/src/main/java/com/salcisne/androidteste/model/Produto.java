package com.salcisne.androidteste.model;

public class Produto {
    private String nome;
    private String local;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto(String nome, String local, int quantidade) {
        this.nome = nome;
        this.local = local;
        this.quantidade = quantidade;
    }

}
