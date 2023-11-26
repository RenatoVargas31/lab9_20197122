package com.example.lab9_20197122.daos;

import com.example.lab9_20197122.beans.Rol;
import com.example.lab9_20197122.beans.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao extends BaseDao {

    public Usuario validarUsuario(String correo, String password) {

        Usuario usuario = null;

        String sql = "SELECT * FROM usuario WHERE correo = ? AND password = ?";

        try(Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, correo);
            pstmt.setString(2, password);

            try(ResultSet rs = pstmt.executeQuery();) {
                if(rs.next()) {
                    int usuarioId = rs.getInt(1);
                    usuario = this.obtenerUsuario(usuarioId);
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return usuario;
    }

    public Usuario obtenerUsuario(int usuarioId) {

        Usuario usuario = null;

        String sql = "SELECT * FROM usuario WHERE id = ?";

        try(Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, usuarioId);

            try(ResultSet rs = pstmt.executeQuery();) {
                if(rs.next()) {
                    int id = rs.getInt(1);
                    usuario.setNombre(rs.getString(2));
                    usuario.setCorreo(rs.getString(3));
                    usuario.setPassword(rs.getString(4));

                    Rol rol = new Rol();
                    rol.setIdRol(rs.getInt(5));
                    usuario.setRol(rol);

                    usuario.setUltimo_ingreso(rs.getTimestamp(6));
                    usuario.setCantidad_ingresos(rs.getInt(7));
                    usuario.setFecha_registro(rs.getTimestamp(8));
                    usuario.setFecha_edicion(rs.getTimestamp(9));

                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return usuario;
    }



}
