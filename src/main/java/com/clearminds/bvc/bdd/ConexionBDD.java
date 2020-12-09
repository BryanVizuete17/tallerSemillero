package com.clearminds.bvc.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

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
}
