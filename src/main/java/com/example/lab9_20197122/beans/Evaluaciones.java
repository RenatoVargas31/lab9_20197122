package com.example.lab9_20197122.beans;

import java.sql.Timestamp;

public class Evaluaciones {

    private int idEvaluacion;
    private String nombre_estudiantes;
    private String codigo_estudiantes;
    private String correo_estudiantes;
    private int nota;
    private Curso curso;
    private Timestamp fecha_registro;
    private Timestamp fecha_edicion;

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getNombre_estudiantes() {
        return nombre_estudiantes;
    }

    public void setNombre_estudiantes(String nombre_estudiantes) {
        this.nombre_estudiantes = nombre_estudiantes;
    }

    public String getCodigo_estudiantes() {
        return codigo_estudiantes;
    }

    public void setCodigo_estudiantes(String codigo_estudiantes) {
        this.codigo_estudiantes = codigo_estudiantes;
    }

    public String getCorreo_estudiantes() {
        return correo_estudiantes;
    }

    public void setCorreo_estudiantes(String correo_estudiantes) {
        this.correo_estudiantes = correo_estudiantes;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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
