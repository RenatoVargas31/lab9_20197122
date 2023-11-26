package com.example.lab9_20197122.beans;

import java.sql.Timestamp;

public class Facultad {

    private int idFacultad;
    private String nombre;
    private Universidad universidad;
    private Timestamp fecha_registro;
    private Timestamp fecha_edicion;

    public int getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(int idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
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
