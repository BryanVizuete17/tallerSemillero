package com.clearminds.bvc.bdd.test;

import java.sql.SQLException;

import com.clearminds.bvc.dtos.Estudiante;
import com.clearminds.bvc.excepciones.BDDException;
import com.clearminds.bvc.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) {
	
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Andres","Chavez"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
