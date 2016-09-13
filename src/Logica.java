import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private PApplet app;

	public Logica(PApplet app) {
		this.app = app;
	}

	public void ejercicioUno() {
		HashSet<Bola> bolas = new HashSet<Bola>();
		bolas.add(new Bola(10));

		bolas.add(new Bola(10));
		bolas.add(new Bola(15));
		bolas.add(new Bola(20));
		bolas.add(new Bola(10));
		bolas.add(new Bola(25));

		for (Bola bola : bolas) {
			System.out.println(bola.radio);
		}
		// System.out.println();
	}

	/*
	 * public void ejercicioDos(boolean pint) { if (pint == true) { int caso =
	 * 0; ArrayList<Bola> bolas = new ArrayList<Bola>(); HashSet<Bola> bolasHash
	 * = new HashSet<Bola>();
	 * 
	 * if (app.key == '1') caso = 1; if (app.key == '2') caso = 2;
	 * 
	 * // agregar manualmente al ArrayList
	 * 
	 * bolas.add(new Bola(5)); bolas.add(new Bola(10)); bolas.add(new Bola(15));
	 * bolas.add(new Bola(20)); bolas.add(new Bola(25)); bolas.add(new
	 * Bola(20));
	 * 
	 * switch (caso) { case 0: System.out.println(
	 * "presione DERECHA para pasar de hashSet a ArayList"); System.out.println(
	 * "preciones IZQUIERDA para pasar de ArrayList a hashSet"); break; case 1:
	 * // BoalsH es el hashSet, bolas es el ArrayList bolasHash.addAll(bolas);
	 * bolas.clear();
	 * 
	 * 
	 * for (Bola bola : bolas) System.out.println("Array: " + bola.getRadio());
	 * 
	 * for (Bola bola : bolasH) System.out.println("Hash: " + bola.getRadio());
	 * 
	 * break; case 2: for (Bola bola : bolasHash) { if (bolasHash.add(bola)) {
	 * bolasHash.add(bola); System.out.println("Agregado"); } else {
	 * System.out.println("No se agregó"); } } break; } int lel = 0; lel++;
	 * System.out.println("caso: " + caso); System.out.println("Ejecución: " +
	 * lel); } }
	 */

	public void ejercicioDos() {
		ArrayList<Bola> bolas = new ArrayList<Bola>();
		HashSet<Bola> bolasHash = new HashSet<Bola>();

		bolas.add(new Bola(5));
		bolas.add(new Bola(10));
		bolas.add(new Bola(15));
		bolas.add(new Bola(20));
		bolas.add(new Bola(25));
		bolas.add(new Bola(20));

		if (app.key == '1') {
			System.out.println("Tamaño Hash: " + bolasHash.size());
			System.out.println("Tamaño arraylist " + bolas.size());
			for (int i = 0; i < bolas.size(); i++) {
				// Ayuda de Camilo José Montoya para saber si el objeto fue
				// agregado al HashSet
				if (bolasHash.add(bolas.get(i))) {
					bolasHash.add(bolas.get(i));
					System.out.println(bolas.get(i).getRadio() + " Fue agregado.");
				} else {
					System.out.println(bolas.get(i).getRadio() + " No fue agregado.");
				}
			}
			bolas.clear();
			System.out.println("Tamaño Hash: " + bolasHash.size());
			System.out.println("Tamaño arraylist " + bolas.size());
		}

		if (app.key == '2') {
			System.out.println(bolas.isEmpty());
			for (Bola bola : bolasHash) {
				System.out.println("entra");
				if (bolas.add(bola)) {
					bolas.add(bola);
					System.out.println("Agregado");
				} else {
					System.out.println("No se agregó");
				}
			}
			bolasHash.clear();
		}
	}

	public void ejercicioTres() {
		HashSet<Bola> bolaH = new HashSet<Bola>();
		TreeSet<Bola> bolaT = new TreeSet<Bola>();

		bolaH.add(new Bola(5));
		bolaH.add(new Bola(10));
		bolaH.add(new Bola(15));
		bolaH.add(new Bola(20));
		bolaH.add(new Bola(25));

		if (app.key == '1') {
			System.out.println("HashSet a TreeSet");
			bolaT.addAll(bolaH);
			for (Bola bola : bolaT) {
//				bolaT.add(bola);
				System.out.println(bola.radio);
			}
			bolaH.clear();
			System.out.println("bolaT " + bolaT.size());
			System.out.println("bolaH " + bolaH.size());
		}
		
		if (app.key == '2') {

			bolaH.addAll(bolaT);

			System.out.println("TreeSet a HashSet");
			System.out.println("size: " + bolaH.size());
			for (Bola bola2 : bolaH) {
				System.out.println(bola2.getRadio());
			}
			System.out.println("bolaT " + bolaT.size());
			System.out.println("bolaH " + bolaH.size());
			bolaT.clear();
		}
	}
}
