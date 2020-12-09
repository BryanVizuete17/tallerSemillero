package com.clearminds.bvc.servicios;

import java.io.ObjectStreamException;
import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.bvc.dtos.Estudiante;
import com.clearminds.bvc.excepciones.BDDException;
import com.clearminds.bvc.bdd.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException, SQLException {

		abrirConexion();
		System.out.println("Insertando Estudiante: " + estudiante.toString());
		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();
			String sql = "insert into estudiantes(nombre,apellido) values('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido() + "')";

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException, SQLException {
		abrirConexion();
		System.out.println("Actualizando Estudiante: " + estudiante.toString());
		Statement stmt = null;
		try {

			stmt = getConexion().createStatement();
			String sql = "update estudiantes set nombre = '" + estudiante.getNombre() + "', apellido = '" + estudiante.getApellido() + "' where id =" + estudiante.getId();

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}

}
