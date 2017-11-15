package com.aab.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/* Conexión:
 * 
 * DB = crudproyect
 * user = "root" o el que tenga la cuenta de phpMyAdmin, VARCHAR 20
 * password = ""  o el que tenga la cuenta de phpMyAdmin
 * table = users
 * 
 * 
 * Estructura tabla:
 * id = A_I, primary_key
 * name = Varchar, 20
 * lastname = Varchar, 20
 * age = int;
 */

public interface IConnection<Mysql> {

	static Connection getConnection() {
		Connection connection = null;

		/* Declaramos los datos, ser finales o no es opcional */
		final String user = "root";
		final String password = "";

		/* Intentamos establecer conexión */
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/crudproyect", user, password);
			if (connection != null) {
				System.out.println("The conecction was succesfull");
			} else {
				System.out.println("Unable to connect to DB");
			}
		} catch (Exception error) {
			System.out.println("The connection appears tu be null");
			error.getMessage();
			error.printStackTrace();
		}
		return connection;
	}

}
