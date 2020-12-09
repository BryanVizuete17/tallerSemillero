package com.clearminds.bvc.bdd.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.bvc.bdd.ConexionBDD;
import com.clearminds.bvc.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {

		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion != null){
				System.out.println("Conexion Exitosa");	
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
