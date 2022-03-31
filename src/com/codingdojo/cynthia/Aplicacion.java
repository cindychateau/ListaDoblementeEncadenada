package com.codingdojo.cynthia;

public class Aplicacion {

	public static void main(String[] args) {
		
		Nodo n1 = new Nodo("Fabian");
		Nodo n2 = new Nodo("Alex");
		Nodo n3 = new Nodo("Jhonnatan");
		Nodo n4 = new Nodo("Vale");
		
		DLL lista = new DLL();
		
		lista.agregarNodo(n1);
		lista.agregarNodo(n2);
		lista.agregarNodo(n3);
		lista.agregarNodo(n4);
		
		lista.imprimirLista();
		System.out.println("-------------");
		lista.imprimirListaAlreves();

	}

}
