package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Entities.Conexion;

public class ModeloPersonas {
	
	public String getPeople() {
		try {
			Conexion c = new Conexion();
			Connection con = c.conectar();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from prog2.personas");
			String resultadoBD = "";
			while (rs.next()) {
				resultadoBD += "ID: " + rs.getInt("id_persona") + "\n";
				resultadoBD += "Nombre: " + rs.getString("nombre") + "\n";
				resultadoBD += "Apellido: " + rs.getString("apellido") + "\n";
				resultadoBD += "Cedula: "+ rs.getInt("cedula") + "\n";
				resultadoBD += "Edad: " + rs.getInt("edad") + "\n";
				resultadoBD += "Fecha Nacimiento: " + rs.getString("fecha_nacimiento") + "\n";
				resultadoBD += "Nit Biologico:" + rs.getInt("nit_biologico") + "\n";
				resultadoBD += "---------------------------------------------------\n";
			}
			c.cerrar(con);
			return resultadoBD;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
