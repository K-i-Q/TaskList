package com.br.tasklist.model;

import androidx.annotation.NonNull;

import java.util.List;

public class Tarefa {
    private long id;
    private String titulo;
    private String descricao;
    private String foto;
    private List<Usuario> usuarios;

    public Tarefa(long id, String nome, String descricao, String foto, List<Usuario> usuarios) {
        this.id = id;
        this.titulo = nome;
        this.descricao = descricao;
        this.foto = foto;
        this.usuarios = usuarios;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Id: ["+this.id+"], Titulo: ["+this.titulo +"], Descrição: ["+this.descricao+"]}");
        return stringBuilder.toString();
    }
}
