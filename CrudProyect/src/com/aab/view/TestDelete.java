package com.aab.view;

import com.aab.controllers.CrudUser;

/* 
 * Si no se conecta leer datos de conexion en interfaz IConnection, posiblemente haya que cambiar usuario y contraseña de la DB
 */

public class TestDelete {

	public static void main(String[] args) {
		
		CrudUser cu = new CrudUser();
		
		/* Tener en cuenta que antes hay que revisar la base de datos para que tenga datos y que exista el id a borrar */
		if(cu.delete(19)){
			System.out.println("Information successfully deleted");
		}else{
			System.out.println("Cannot delete data");
		}

	}

}
