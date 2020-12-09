package com.clearminds.bvc.servicios;

import java.sql.SQLException;

import com.clearminds.bvc.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{

	public static void main(String[] args) throws BDDException, SQLException {
		ServicioEstudiante se = new ServicioEstudiante();
		se.abrirConexion();
		se.cerrarConexion();
	}
	
}
