package com.codingdojo.cynthia;

public class DLL {
	
	public Nodo head;
	public Nodo tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	/* N1 nx: null prev: null; 
	 * N2 nx:null prev:null; 
	 * N3 nx: null prev: null
	 * DLL head = null; tail = null 
	 * 
	 * nuevoNodo = N1
	 * head = N1
	 * tail = N1
	 * 
	 * nuevoNodo = N2
	 * ultimoNodo = N1
	 * N1.nx = N2
	 * N2.prev = N1
	 * tail = N2
	 * 
	 * nuevoNodo = N3
	 * ultimoNodo = N2
	 * N2.nx = N3
	 * N3.prev = N2
	 * tail = N3
	 * */
	public void agregarNodo(Nodo nuevoNodo) {
		if(this.head == null) {
			//Si mi lista está vacía, entonces mi principio y mi fin son el nuevoNodo
			this.head = nuevoNodo;
			this.tail = nuevoNodo;
		}else {
			//Obtenemos el último nodo
			Nodo ultimoNodo = this.tail;
			//El siguiente del ultimo nodo es el nodo que estoy recibiendo
			ultimoNodo.next = nuevoNodo;
			//Y el nodo previo al nuevo nodo es el que antes tenía como último nodo
			nuevoNodo.previous = ultimoNodo;
			//El nuevo nodo es el final de mi lista
			this.tail = nuevoNodo;
		}
		
	}
	
	public void imprimirLista() {
		Nodo actual = this.head;
		
		while(actual != null) {
			System.out.println(actual.nombre);
			actual = actual.next;
		}
	}
	
	public void imprimirListaAlreves() {
		Nodo actual = this.tail;
		
		while(actual != null) {
			System.out.println(actual.nombre);
			actual = actual.previous;
		}
	}
	
}
