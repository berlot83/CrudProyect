package com.aab.dao;

import java.util.List;

import com.aab.entities.User;

/* 
 * Si no se conecta leer datos de conexion en interfaz IConnection, posiblemente haya que cambiar usuario y contraseña de la DB
 */

/*	Extendemos esta interface de IConnection para que se conecte automáticamente	*/
public interface Crud<Mysql> extends IConnection<Mysql> {

	List<User> read();

	boolean update(String name, String lastname, int age, int id) throws Exception;

	boolean delete(int id);

	boolean create(String name, String lastname, int age) throws Exception;

}
