package com.aab.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aab.entities.User;
import com.aab.dao.Crud;
import com.aab.dao.IConnection;

/* 
 * Si no se conecta leer datos de conexion en interfaz IConnection, posiblemente haya que cambiar usuario y contraseña de la DB
 */


/* Si se quieren hacer modificaciones a esta clase recomiendo crear otra y extenderla de esta */
public class CrudUser implements Crud {

	Connection connection = null;

	@Override
	public boolean create(String name, String lastname, int age) throws Exception {

		boolean created = false;

		try {
			connection = IConnection.getConnection();
			if (connection != null) {
				PreparedStatement ps;
				String sql = "INSERT INTO users(name, lastname, age) VALUES(?,?,?)";
				ps = connection.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, lastname);
				ps.setInt(3, age);
				ps.execute();
				ps.close();
				created = true;
			} else {
				created = false;
				System.out.println("Unable to insert to DB");
			}
		} catch (Exception error) {
			System.out.println("Cannot establish connection to DB");
			throw new Exception();
		}
		return created;
	}

	@Override
	public List<User> read() {

		List<User> list = new ArrayList<>();
		int id = 0;
		String name = null;
		String lastname = null;
		int age = 0;

		try {
			connection = IConnection.getConnection();
			if (connection != null) {
				Statement st;
				String sql = "SELECT * FROM users";
				st = connection.createStatement();
				ResultSet rs = st.executeQuery(sql);

				while (rs.next()) {
					id = rs.getInt("id");
					name = rs.getString("name");
					lastname = rs.getString("lastname");
					age = rs.getInt("age");
					list.add(new User(id, name, lastname, age));

				}
			} else {

			}
		} catch (Exception error) {

		}
		return list;
	}

	@Override
	public boolean update(String name, String lastname, int age, int id) throws Exception {

		boolean updated = false;

		try {
			connection = IConnection.getConnection();
			if (connection != null) {
				PreparedStatement ps;
				String sql = "UPDATE users SET name=? , lastname=? ,age=? WHERE id= ?";
				ps = connection.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, lastname);
				ps.setInt(3, age);
				ps.setInt(4, id);
				ps.execute();
				ps.close();
				updated = true;
			} else {
				updated = false;
				System.out.println("Unable to update to DB");
			}
		} catch (Exception error) {
			System.out.println("Cannot establish connection to DB");
			throw new Exception();
		}
		return updated;
	}

	@Override
	public boolean delete(int id) {
		
		boolean deleted = false;
		
		try{
			connection = IConnection.getConnection();
			if(connection != null){
				PreparedStatement ps;
				String sql = "DELETE FROM users WHERE id=?";
				ps = connection.prepareStatement(sql);
				ps.setInt(1, id);
				ps.execute();
				ps.close();
				deleted = true;
			}else{
				System.out.println("Unable to delete");
				deleted = false;
			}
		}catch(Exception error){
			error.printStackTrace();
			error.getMessage();
		}
		return deleted;
	}

}
