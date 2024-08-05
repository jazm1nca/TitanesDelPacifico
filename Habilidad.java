package ar.com.jazmin;

public class Habilidad {
	
	int danio;
	String nombre;
	
	public Habilidad(int danio, String nombre) {
		this.danio = danio;
		this.nombre = nombre;
	}
	
	public int suma(int num, int num1) {
		return num + num1;
		
	}

	
	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
