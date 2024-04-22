package com.salesianostriana.dam.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Primary
public class SpanishSaludator {

	
	
	
	public void imprimirSaludo() {
		System.out.println("Hola a  todos");
	}
	@PostConstruct
	void alComenzar() {
		System.out.println("Antes del constructor");
	}
	@PreDestroy
	void antesDestruir() {
		System.out.println("Antes de que termine el programa");
	}
}
	//un bean puede ser  un SINGLETON significa que solo tenemos una instancia 
	//Puede ser PROTYPE tendremos n instancias del bean tantas como necesite el programador 
	//Para marcar el ambito si no es singleton usaremos la anotación "@Scope(ambito)"
	//Roatma.sh pagina con ayuda para progrmadores 