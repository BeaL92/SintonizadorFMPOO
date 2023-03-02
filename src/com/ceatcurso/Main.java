package com.ceatcurso;

import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		
		int opcion;
		Scanner entrada=new Scanner(System.in);
		SintonizadorFM sintonizarFm=new SintonizadorFM();
		
		do {
			
			System.out.println("*** RADIO FM ***");
			System.out.println("1. Subir");
			System.out.println("2. Bajar");
			System.out.println("3. Indicar un favorito");
			System.out.println("4. Apagar la radio");
			System.out.print("Indique su opcion-> ");
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1 -> {
				sintonizarFm.up();
				sintonizarFm.display();
			}
			case 2 -> {
				sintonizarFm.down();
				sintonizarFm.display();
			}
			case 3-> {
				System.out.println("Indica la frecuencia Favorita");
				sintonizarFm.setFrecuencia(entrada.nextDouble());
				sintonizarFm.display();
				
			}
			case 4->System.out.println("---Apagando----");
			default->
			System.out.println("Opción no Válida");
			
			
		}
			
			
		}while (opcion!=4);
		
		entrada.close();
	}

}

