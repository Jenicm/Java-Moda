package com.curso.main;

import java.util.ArrayList;

import com.curso.moda.*;

public class Main {

	// ArrayList de objetos EquipoPasarela. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<EquipoPasarela> integrantes = new ArrayList<EquipoPasarela>();

	public static void main(String[] args) {

		EquipoPasarela disenador1 = new Disenador(1,"Pablo", "Delfin", 35, "Delfin");
		EquipoPasarela modelo1 = new Modelo(2, "Marta", "Perez", 19, 36, "adulto", "femenino");
		EquipoPasarela modista1 = new Modista(3, "Raúl", "Martinez", 41, 18, "Licenciado en Patronaje");

		integrantes.add(disenador1);
		integrantes.add(modelo1);
		integrantes.add(modista1);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan a practicar para el desfile.");
		for (EquipoPasarela integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.prepararse();
		}

		// VIAJE
		System.out.println("Todos los integrantes viajan para hacer un desfile.");
		for (EquipoPasarela integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("Practicando: Todos los integrantes tienen su función");
		for (EquipoPasarela integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.practicar();
		}

		// PARTIDO DE FUTBOL
		System.out.println("Desfile: Todos los integrantes tienen su función en un desfile");
		for (EquipoPasarela integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.desfilar();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println("Diseñar ropa: solo el Disenador tiene el método para diseñar");
		System.out.print(disenador1.getNombre() + " " + disenador1.getApellidos() + " -> ");
		((Disenador) disenador1).disenar();

		// ENTREVISTA
		System.out.println("Entrevista: solo el Modelo tiene el método para dar una entrevista:");
		System.out.print(modelo1.getNombre() + " " + modelo1.getApellidos() + " -> ");
		((Modelo) modelo1).entrevista();

		// MASAJE
		System.out.println("Coser: Solo el Modista tiene el método para coser ropa");
		System.out.print(modista1.getNombre() + " " + modista1.getApellidos() + " -> ");
		((Modista) modista1).coser();

	}
}
