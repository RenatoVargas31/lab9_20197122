package com.example.lab9_20197122.beans;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Usuario {

    private int idUsuario;
    private String nombre;
    private String correo;
    private String password;
    private Rol rol;
    private Timestamp ultimo_ingreso;
    private int cantidad_ingresos;
    private Timestamp fecha_registro;
    private Timestamp fecha_edicion;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Timestamp getUltimo_ingreso() {
        return ultimo_ingreso;
    }

    public void setUltimo_ingreso(Timestamp ultimo_ingreso) {
        this.ultimo_ingreso = ultimo_ingreso;
    }

    public int getCantidad_ingresos() {
        return cantidad_ingresos;
    }

    public void setCantidad_ingresos(int cantidad_ingresos) {
        this.cantidad_ingresos = cantidad_ingresos;
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
