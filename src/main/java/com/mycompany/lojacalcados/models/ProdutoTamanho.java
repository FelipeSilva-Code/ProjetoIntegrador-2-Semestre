package com.mycompany.lojacalcados.models;

public class ProdutoTamanho {
    private int id;
    private int fkProduto;
    private double tamanho;

    public ProdutoTamanho(int fkProduto, double tamanho) {
        this.fkProduto = fkProduto;
        this.tamanho = tamanho;
    }

    
    public int getId() {
        return id;
    }

    public int getFkProduto() {
        return fkProduto;
    }

    public void setFkProduto(int fkProduto) {
        this.fkProduto = fkProduto;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
