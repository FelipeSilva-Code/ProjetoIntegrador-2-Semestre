package com.mycompany.lojacalcados.models;

public class Produto {
    private String codigo;
    private String titulo;
    private String marca;
    private double preco;
    private String email;
    private int qtd;

    public Produto(String codigo, String titulo, String marca, double preco, String email, int qtd) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.marca = marca;
        this.preco = preco;
        this.email = email;
        this.qtd = qtd;
    }
   
    
    public String getCodigo()
    {
        return this.codigo;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public double getPreco()
    {
        return this.preco;
    }
    
    public int getQtd()
    {
        return this.qtd;
    }
   
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
     
     public void setMarca(String marca)
    {
        this.marca = marca;
    }
      
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
       
    public void setQtd(int qtd)
    {
        this.qtd = qtd;
    }
}
