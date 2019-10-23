package com.br.tasklist.model;

import androidx.annotation.NonNull;

public class Usuario {
    private long id;
    private String nome;
    private String foto;
    private String telefone;
    private String email;
    private String senha;

    public Usuario(String nome, String foto, String email, String telefone, String senha) {
        this.nome = nome;
        this.foto = foto;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Id: ["+this.id+"], Nome: ["+this.nome+"], email: ["+this.email+"], Telefone: ["+this.telefone+"]}");
        return stringBuilder.toString();
    }
}
