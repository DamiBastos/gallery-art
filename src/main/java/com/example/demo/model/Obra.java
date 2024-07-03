package com.example.demo.model;

import java.util.Date;

public class Obra {
    private Integer id;
    private String titulo;
    private Date anio;
    private String descripcion;
    private String img;

    public Obra(Integer id, String titulo, Date anio, String descripcion, String img) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.descripcion = descripcion;
        this.img = img;
    }

    /**
     * Constructor que solo recibe 3 parámetros
     * 
     * @param titulo
     * @param descripcion
     * @param img
     */
    public Obra(String titulo, String descripcion, String img) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
    }

    public Obra(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
