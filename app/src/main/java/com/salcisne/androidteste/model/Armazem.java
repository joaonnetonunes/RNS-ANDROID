package com.salcisne.androidteste.model;

import java.util.SplittableRandom;

public class Armazem {

    private int versao;
    private String dataUltAlteracao;
    private int id;
    private String produtoId;
    private String filialCNPJ;
    private int quantidade;
    private boolean isNew;

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public String getDataUltAlteracao() {
        return dataUltAlteracao;
    }

    public void setDataUltAlteracao(String dataUltAlteracao) {
        this.dataUltAlteracao = dataUltAlteracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public String getFilialCNPJ() {
        return filialCNPJ;
    }

    public void setFilialCNPJ(String filialCNPJ) {
        this.filialCNPJ = filialCNPJ;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
