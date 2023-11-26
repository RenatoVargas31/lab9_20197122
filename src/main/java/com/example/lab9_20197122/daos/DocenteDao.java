package com.example.lab9_20197122.daos;

import com.example.lab9_20197122.beans.Evaluaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DocenteDao extends BaseDao{

    public ArrayList<Evaluaciones> obtenerListaEvaluaciones(int idDocente){
        ArrayList<Evaluaciones> listaEvaluaciones = new ArrayList<>();

        String sql = "SELECT * FROM evaluaciones WHERE idDocente = ?";

        try(Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, idDocente);

            try(ResultSet rs = pstmt.executeQuery();) {
                while(rs.next()) {
                    Evaluaciones evaluaciones = new Evaluaciones();
                    evaluaciones.setIdEvaluacion(rs.getInt(1));
                    evaluaciones.setNombre_estudiantes(rs.getString(2));
                    evaluaciones.setCodigo_estudiantes(rs.getString(3));
                    evaluaciones.setCorreo_estudiantes(rs.getString(4));
                    evaluaciones.setNota(rs.getInt(5));
                    evaluaciones.setFecha_registro(rs.getTimestamp(7));
                    evaluaciones.setFecha_edicion(rs.getTimestamp(8));

                    listaEvaluaciones.add(evaluaciones);
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return listaEvaluaciones;
    }
}
