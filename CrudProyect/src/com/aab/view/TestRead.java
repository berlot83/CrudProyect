package com.aab.view;

import java.util.List;

import com.aab.controllers.CrudUser;
import com.aab.entities.User;

/* 
 * Si no se conecta leer datos de conexion en interfaz IConnection, posiblemente haya que cambiar usuario y contrase�a de la DB
 */

public class TestRead {

	public static void main(String[] args) {

		/*
		 * El m�todo read() devuelve una List<User> la cual recorremos con un
		 * foreach
		 */
		CrudUser cu = new CrudUser();
		
		List<User> userList = cu.read();
		for (User item : userList) {
			System.out.println(item.toString());
		}

	}

}
