package org.generation.italy;

public class Automobili {

	int velocitą;
	float carburante, consumoMedio, totKmPercorsi; //disponibilitąCarburante consumoMedio kmPercorsi
	
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
		System.out.println("km percorsi: " + totKmPercorsi + "km");
	}
	
	public void aggiorna() { //simula il passaggio di 1h
		
		int kmPercorsi1h=velocitą; //in un ora ho percorso un n di km pari alla velocitą
		
		totKmPercorsi+=kmPercorsi1h; //aggiunge al totale i km percorsi in un ora
		carburante-=kmPercorsi1h/consumoMedio; //scalo l da carburante (in un ora)
		
		
	
}

	}		
			
		
	
	
	

