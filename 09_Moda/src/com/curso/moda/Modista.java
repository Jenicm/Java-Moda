package com.curso.moda;

public class Modista extends EquipoPasarela {
	
	public int experiencia;
	public String titulacion;
	
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public Modista() {
		super();
	}
	
	public Modista(int id, String nombre, String apellidos, int edad, int experiencia, String titulacion) {
		super(id, nombre, apellidos, edad);
		this.setExperiencia(experiencia);
		this.setTitulacion(titulacion);
	}
	
	public void coser() {
		System.out.println("Estoy cosiendo");
	}
	
	@Override
	public void desfilar() {
		System.out.println("Estoy arreglando vestidos");
	}
}
