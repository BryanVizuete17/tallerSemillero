package com.clearminds.bvc.excepciones;

import java.sql.SQLException;

public class BDDException extends Exception {

	
	public BDDException(String message) {
		super(message);
	}
}
