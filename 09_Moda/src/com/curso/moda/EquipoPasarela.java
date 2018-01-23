package com.curso.moda;

public abstract class EquipoPasarela implements IIntegrantePasarela {
	
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public EquipoPasarela() {
	}

	public EquipoPasarela(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
		

	//@Override
	public void viajar() {	
		System.out.println("Nos vamos de viaje");
	}

	//@Override
	public void desfilar() {

	}

	//@Override
	public void prepararse() {	
		System.out.println("Nos estamos preparando");
	}

	//@Override
	public void practicar() {
		System.out.println("Estamos ensayando");
	}

}
