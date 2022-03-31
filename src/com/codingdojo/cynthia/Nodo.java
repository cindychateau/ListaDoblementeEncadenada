package com.codingdojo.cynthia;

public class Nodo {
	
	public String nombre;
	public Nodo previous;
	public Nodo next;
	
	public Nodo(String nombre) {
		//super();
		this.nombre = nombre;
		this.previous = null;
		this.next = null;
	}
	
	
}
