package main;

import main.exercises.EjercicioGrafos;
import main.impl.conjunto.ConjuntoDinamico;
import main.impl.grafo.GrafoDinamico;
import main.impl.grafo.GrafoEstatico;
import main.interfaces.GrafoTDA;
import main.utils.ConjuntoUtils;
import main.utils.GrafoUtils;

public class Main {

	public static void main(String[] args) {
		
		GrafoTDA grafo = new GrafoEstatico();
		grafo.agregarVertice(1);
		grafo.agregarVertice(2);
		grafo.agregarVertice(3);
		grafo.agregarArista(3, 1, -1);
		grafo.agregarArista(2, 1, -1);
		ConjuntoUtils.mostrarConjunto((ConjuntoDinamico)EjercicioGrafos.predecesores(grafo, 1));
		GrafoUtils.mostrarGrafo(grafo);
		
		System.out.println();
		
		GrafoTDA grafo2 = new GrafoDinamico();
		grafo2.agregarVertice(1);
		grafo2.agregarVertice(2);
		grafo2.agregarVertice(3);
		//grafo2.agregarArista(3, 1, -1);
		grafo2.agregarArista(2, 1, -1);
		ConjuntoUtils.mostrarConjunto((ConjuntoDinamico)EjercicioGrafos.predecesores(grafo2, 1));
		GrafoUtils.mostrarGrafo(grafo2);	
	}
}
