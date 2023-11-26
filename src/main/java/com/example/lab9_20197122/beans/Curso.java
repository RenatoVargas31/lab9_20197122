package com.example.lab9_20197122.beans;

import java.sql.Timestamp;

public class Curso {

    private int idCurso;
    private String codigo;
    private String nombre;
    private Facultad facultad;
    private Timestamp fecha_registro;
    private Timestamp fecha_edicion;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Timestamp getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(Timestamp fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }
}
