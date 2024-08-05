package ar.com.jazmin;

import java.util.ArrayList;
import java.util.List;

public class TitanesDelPacifico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Habilidad volar = new Habilidad (100, "nombre");
		Habilidad emitirRayos = new Habilidad (100, "nombre");
		
		List<Habilidad>habilidades = new ArrayList<>();
		habilidades.add(emitirRayos);
		habilidades.add(volar);
		
		Kaiju kaiju = new Kaiju (300 ,habilidades ,5 ,280 ,100 ,500 ,90);
	}

}
