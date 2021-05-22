package com.unab.clase.ejercicio.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.unab.clase.ejercicio.Conexion.ConexionBd;

public class ClsArchivos {

	public void guardararchivos(String nombre) {
		ConexionBd con = new ConexionBd();
		PreparedStatement stm;
		String consulta = "Insert into image(nameoffile) values(?)";
		try {
			stm = con.RetornarConexion().prepareStatement(consulta);
			stm.setString(1, nombre);
			stm.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public String seleccionararchivos() {
		ConexionBd con = new ConexionBd();
		String nombre = "";
		PreparedStatement stm;
		String consulta = "Select * from image";
		try {
			stm = con.RetornarConexion().prepareStatement(consulta);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
                nombre = rs.getString("nameoffile");
            }
		} catch (Exception e) {
			System.out.println(e);
		}
		return nombre;
	}
	
}
