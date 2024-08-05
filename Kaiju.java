package ar.com.jazmin;

import java.util.List;

public class Kaiju {
	
	int vida;
	List<Habilidad> habilidades;
	int categoria;
	int tamanio;
	int energia;
	int poder;
	int peso;
	
	public Kaiju(int vida, List<Habilidad> habilidades, int categoria, int tamanio, int energia, int poder, int peso) {
		super();
		this.vida = vida;
		this.habilidades = habilidades;
		this.categoria = categoria;
		this.tamanio = tamanio;
		this.energia = energia;
		this.poder = poder;
		this.peso = peso;
	}
	

}
