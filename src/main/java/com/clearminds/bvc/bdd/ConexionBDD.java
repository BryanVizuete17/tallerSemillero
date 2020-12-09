package com.clearminds.bvc.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.bvc.excepciones.BDDException;

public class ConexionBDD {

	
	public static String leerpropiedad (String propiedad){
		String property = null;
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
			if (p.getProperty(propiedad) != null) {
				property = p.getProperty(propiedad).toString();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return property;
	}
	
	
	public static Connection obtenerConexion() throws BDDException, SQLException{
		Connection con = null;
		String usuario = leerpropiedad("usuario");
		String psswrd = leerpropiedad("password");
		String url = leerpropiedad("urlConexion");
		con = DriverManager.getConnection(url, usuario, psswrd);
		if (con == null) {
			
			throw new BDDException("No se pudo conectar a la base");
		} else {
			System.out.println("Conexion inicializada");
			return con;
		}	
	}
}
