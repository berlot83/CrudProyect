package com.aab.entities;

/*	Creamos una tabla llamada "users" dentro de la DB crudproyect	*/
public class User {

	private int id;
	private String name;
	private String lastname;
	private int age;

	/*
	 * Contructor vacío por si necesitamos acceder a atributos sin tener que
	 * setear nada
	 */
	public User() {

	}

	/* Va a servinos en una de las formas de recuperar los datos de la DB */
	public User(int id, String name, String lastname, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}

	/* Setters y Getters */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " " + getName() + ", " + lastname + ", " + getAge();
	}

}
