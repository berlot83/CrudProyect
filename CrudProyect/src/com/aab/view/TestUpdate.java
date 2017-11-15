package com.aab.view;

import com.aab.controllers.CrudUser;

/* 
 * Si no se conecta leer datos de conexion en interfaz IConnection, posiblemente haya que cambiar usuario y contraseña de la DB
 */

public class TestUpdate {

	public static void main(String[] args) throws Exception {

		CrudUser cu = new CrudUser();

		/*
		 * Condirmar que en la tabla existan los id que corresponden al cuarto
		 * parámetro, update() devuelve un boolean si da true se insertó
		 */
		if (cu.update("Molocoton", "Pi", 20, 20)) {
			System.out.println("Updated was successfull");
		} else {
			System.out.println("Unable to update DB");
		}

		if (cu.update("Walter", "Moloko", 1, 22)) {
			System.out.println("Updated was successfull");
		} else {
			System.out.println("Unable to update DB");
		}

	}

}
