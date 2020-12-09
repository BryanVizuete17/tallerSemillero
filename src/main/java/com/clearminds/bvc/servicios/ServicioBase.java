package com.clearminds.bvc.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.bvc.bdd.*;
import com.clearminds.bvc.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public void abrirConexion() throws BDDException, SQLException{
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		if(conexion !=null){
			try {
				conexion.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error al cerrar la conexion");
			}
			
		}
	}
}
