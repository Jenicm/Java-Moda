package com.curso.moda;

public class Modelo extends EquipoPasarela {

	public int talla;
	public String tipo;
	public String sexo;
	
	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Modelo() {
		super();
	}
	
	public Modelo(int id, String nombre, String apellidos, int edad, int talla, String tipo, String sexo) {
		super(id, nombre, apellidos, edad);
		this.setTalla(talla);
		this.setTipo(tipo);
		this.setSexo(sexo);
	}
	
	public void entrevista() {
		System.out.println("Da una entrevista");
	}
	
	@Override
	public void desfilar() {
		System.out.println("Desfilar en la pasarela");
	}
	
	@Override
	public void prepararse() {
		System.out.println("Me voy a maquillar");
	}
}
