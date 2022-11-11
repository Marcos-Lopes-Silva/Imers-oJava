package com.api.imdb.entities;

public class Filme {
    
    private String titulo;
    private String ano;
    private String imagem;
   
    public Filme(String titulo, String ano, String imagem){
        this.titulo = titulo;
        this.ano = ano;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }


    
}   
