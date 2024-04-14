package com.mycompany.lojacalcados.models;


public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String nascimento;
    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String nascimento, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.telefone = telefone;
    }
   
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getCpf()
    {
        return this.cpf;
    }
    
    public String getNascimento()
    {
        return this.nascimento;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public String getTelefone()
    {
        return this.telefone;
    }
   
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setNascimento(String nascimento)
    {
        this.nascimento = nascimento;
    }
     
     public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
      
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
       
    public void setEmail(String email)
    {
        this.email = email;
    }
}
