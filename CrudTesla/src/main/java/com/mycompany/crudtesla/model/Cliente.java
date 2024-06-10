package com.mycompany.crudtesla.model;

public class Cliente {
    
    private Integer id_dados_identificacao;
    private String nome_completo;
    private String email;
    private String nome_usuario;
    private String senha;
    private String data_nascimento;
    private String numero_telefone;
    private String endereco;
    private String informacoes_cartao;
    
    public Cliente(Integer id_dados_identificacao, String nome_completo, String email, String nome_usuario, String senha, String data_nascimento, String numero_telefone, String endereco, String informacoes_cartao){
        this.id_dados_identificacao = id_dados_identificacao;
        this.nome_completo = nome_completo;
        this.email = email;
        this.nome_usuario = nome_usuario;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
        this.numero_telefone = numero_telefone;
        this.endereco = endereco;
        this.informacoes_cartao = informacoes_cartao;
    }
    
    public Cliente(String nome_completo, String email, String nome_usuario, String senha, String data_nascimento, String numero_telefone, String endereco, String informacoes_cartao){
        //this.id_dados_identificacao = id_dados_identificacao;
        this.nome_completo = nome_completo;
        this.email = email;
        this.nome_usuario = nome_usuario;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
        this.numero_telefone = numero_telefone;
        this.endereco = endereco;
        this.informacoes_cartao = informacoes_cartao;
    }

    public Integer getId_dados_identificacao() {
        return id_dados_identificacao;
    }

    public void setId_dados_identificacao(Integer id_dados_identificacao) {
        this.id_dados_identificacao = id_dados_identificacao;
    }
    
    public String getNome_completo() {
        return nome_completo;
    }        
    
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInformacoes_cartao() {
        return informacoes_cartao;
    }

    public void setInformacoes_cartao(String informacoes_cartao) {
        this.informacoes_cartao = informacoes_cartao;
    }
    
    
    
}
