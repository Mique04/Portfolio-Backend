package com.miqueassantillan.Portfolio.Web.validation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExisteUsuario {
    private static final String URL = "jdbc:mysql://bdmksmq6uktz66sykzpp-mysql.services.clever-cloud.com:3306/bdmksmq6uktz66sykzpp";
    private static final String USUARIO = "uk5s00rppfmsmyjr";
    private static final String CONTRASEÑA = "PntTfFs1UnAyl8sxUEvG";

    public boolean existeUsuario(String correoElectronico) {
        String sql = "SELECT * FROM persona WHERE Email = ?";
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, correoElectronico);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            // Manejar la excepción aquí
        }
        return false;
    }
}
