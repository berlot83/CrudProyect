package com.aab.view;

import com.aab.controllers.CrudUser;

/* 
 * Si no se conecta leer datos de conexion en interfaz IConnection, posiblemente haya que cambiar usuario y contraseña de la DB
 */

public class TestCreate {

	public static void main(String[] args) throws Exception {
		
		CrudUser cu = new CrudUser();
		
		/*	Ejecutar este código varias veces para que se vaya llenando la DB     */
		if(cu.create("Dante", "Panella", 35)){
			System.out.println("Information successfully inserted");
		}else{
			System.out.println("Cannot insert data");
		}
		
		if(cu.create("Amilcar", "Alberino", 23)){
			System.out.println("Information successfully inserted");
		}else{
			System.out.println("Cannot insert data");
		}
		
		if(cu.create("Que", "hiciste", 707074)){
			System.out.println("Information successfully inserted");
		}else{
			System.out.println("Cannot insert data");
		}
		
	}

}
