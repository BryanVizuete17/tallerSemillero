package com.clearminds.bvc.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.bvc.excepciones.BDDException;

public class ConexionBDD {

	
	public static String leerpropiedad (String propiedad) throws FileNotFoundException, IOException {
		File f=new File("conexion.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());
		String property = null;
		Properties p = new Properties();
		p.load(new FileReader("C:\\Users\\bvizuete\\Desktop\\tallersemillero\\tallerSemillero\\conexion.properties"));
		if (p.getProperty(propiedad) != null) {
			return  p.getProperty(propiedad);
		}
		

		return property;
	}
	
	
	public static Connection obtenerConexion() throws BDDException{
		Connection con = null;
		String usuario;
		String psswrd;
		String url;
		try {
			usuario = leerpropiedad("usuario");
			psswrd = leerpropiedad("password");
			url = leerpropiedad("urlConexion");
			con = DriverManager.getConnection(url, usuario, psswrd);
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}
		
		
	}
	
	
}
