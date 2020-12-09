package com.clearminds.bvc.bdd.test;

import java.util.Properties;

import com.clearminds.bvc.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {
	
		String valor= ConexionBDD.leerpropiedad("propiedad1");
		System.out.println(valor);
		valor=ConexionBDD.leerpropiedad("xx");
		System.out.println(valor);
	}

}
