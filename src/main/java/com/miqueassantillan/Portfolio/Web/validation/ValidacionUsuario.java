/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miqueassantillan.Portfolio.Web.validation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Component;


@Component
public class ValidacionUsuario {
    private static final String URL = "jdbc:mysql://bdmksmq6uktz66sykzpp-mysql.services.clever-cloud.com:3306/bdmksmq6uktz66sykzpp";
    private static final String USUARIO = "uk5s00rppfmsmyjr";
    private static final String CONTRASEÑA = "PntTfFs1UnAyl8sxUEvG";

    public boolean validarUsuario(String correoElectronico, String contrasena) {
    String sql = "SELECT * FROM persona WHERE email = ?";
    try (Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, correoElectronico);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String contrasenaRegistrada = rs.getString("contraseña");
            boolean contrasenaValida = contrasenaRegistrada.equals(contrasena);
            System.out.println("Datos validados con exito");
            return contrasenaValida;
        } else {
            System.out.println("Datos incorrectos");
            return false;
        }
    } catch (SQLException e) {
        System.out.println("No se logró conectar con la base de datos o el email no se encuentra registrado");
        return false;
    }
}

}

