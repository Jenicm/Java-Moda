package com.curso.moda;

public class Disenador extends EquipoPasarela {
	
		public String marca;
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public Disenador() {
			super();
		}
		
		public Disenador(int id, String nombre, String apellidos, int edad, String marca) {
			super(id, nombre, apellidos, edad);
			this.setMarca(marca);
		}
		
		public void disenar() {
			System.out.println("Estoy disenando");
		}
		
		@Override
		public void desfilar() {
			System.out.println("Organizar desfile");
		}
}
