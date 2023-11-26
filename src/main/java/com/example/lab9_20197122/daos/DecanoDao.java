package com.example.lab9_20197122.daos;

import com.example.lab9_20197122.beans.Curso;
import com.example.lab9_20197122.beans.Facultad;
import com.example.lab9_20197122.beans.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DecanoDao extends BaseDao{

    public ArrayList<Curso> obtenerListaCursos(int idDecano){
        ArrayList<Curso> listaCursos = new ArrayList<>();

        String sql = "SELECT * FROM curso WHERE idDecano = ?";

        try(Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, idDecano);

            try(ResultSet rs = pstmt.executeQuery();) {
                while(rs.next()) {
                    Curso curso = new Curso();
                    curso.setIdCurso(rs.getInt(1));
                    curso.setCodigo(rs.getString(2));
                    curso.setNombre(rs.getString(3));

                    Facultad facultad = new Facultad();
                    facultad.setIdFacultad(rs.getInt(4));
                    curso.setFacultad(facultad);

                    curso.setFecha_registro(rs.getTimestamp(5));
                    curso.setFecha_edicion(rs.getTimestamp(6));

                    listaCursos.add(curso);
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return listaCursos;
    }

}
