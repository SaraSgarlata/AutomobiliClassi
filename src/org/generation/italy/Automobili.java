package org.generation.italy;

public class Automobili {

	int velocitą;
	float carburante, consumoMedio, kmPercorsi; //disponibilitąCarburante consumoMedio kmPercorsi
	
	public void accelera() {
		
		if (velocitą<=190)
			velocitą+=10; // mi incrementa di 10
	}
		
	public void decelera() {
		
		if (velocitą>=10)
			velocitą-=10; // mi decrementa di 10
	
	}
			
	public void visualizzaDati() {
		
		System.out.println(" velocitą attuale :" + velocitą + "km/h");
		System.out.println("carburante: " + carburante + "l");
		System.out.println("consumo medio: " + consumoMedio + "km/l" );
		System.out.println("km percorsi: " + kmPercorsi + "km");
	}
	
	public void aggiorna() {
		
		kmPercorsi+=velocitą;
		carburante-=kmPercorsi/consumoMedio;
	
}

	}		
			
		
	
	
	

