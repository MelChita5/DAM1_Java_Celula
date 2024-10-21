package main;

import java.util.Scanner;

import objetos.Celula;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Celula celula1 = new Celula();
		
		System.out.println("================================");
		System.out.println("TU CELULA: ");
		System.out.println("================================");
		System.out.println("Ingresa los siguientes datos >> ");
		System.out.println("--------------------------------");
		System.out.println("Nombre del reino: " );
		celula1.nombreReino = scanner.next();
		System.out.println("Tamano en micrometros: ");
		celula1.tamano = scanner.nextInt();
		System.out.println("Cantidad de moleculas ATP: ");
		celula1.reservaATP = scanner.nextInt();
		System.out.println("Primera hebra del ADN: ");
		celula1.hebraADN1 = scanner.next();
		System.out.println("Segunda hebra del ADN: ");
		celula1.hebraADN2 = scanner.next();
		
		
		
		
		System.out.print(
				"Seleccione una opcion:\n"
				+ "1. Caracteristicas iniciales de tu celula\n"
				+ "2. Crecer celula\n"
				+ "3. Dividir celula\n"
				+ ">> "
			);
		
		int acciones = scanner.nextInt();

		switch (acciones) {
		
		case 1:
			
			System.out.println("--------------------------------");
			System.out.println("Caracteristicas iniciales >>");
			System.out.println("--------------------------------");
			System.out.println("- Celula del reino " + celula1.nombreReino);
			System.out.println("- Posee un tamano de " + celula1.tamano + " micrometros.");
			System.out.println("- Tiene una reserva de " + celula1.reservaATP + " ATP");
			System.out.println("- La hebra " + celula1.hebraADN1 + " y " + celula1.hebraADN2 + " estan en... " );
			
			if(celula1.verificacionDaños() == true) {
				System.out.println("Estado: Sana, hebras complementarias.");
			} else {
				System.out.println("Estado: Danada.");
			}
			
			break;
			
		case 2:
			System.out.println("Ingrese la nueva cantidad de ATP para el crecimiento de tu celula: ");
            int consumoATP = scanner.nextInt();
            
            celula1.crecer(consumoATP);
            
            System.out.println("--------------------------------");
            System.out.println("Nuevas caracteristicas del crecimiento de tu celula >> ");
            System.out.println("--------------------------------");
            System.out.println("- Celula del reino " + celula1.nombreReino);
            System.out.println("- Posee un tamano de " + celula1.tamano + " micrometros");
            System.out.println("- Tiene una reserva de " + celula1.reservaATP + " ATP" );
            System.out.println("- Sus hebras son " + celula1.hebraADN1 + " y " + celula1.hebraADN2 + " estan en... ");
			
            if(celula1.verificacionDaños() == true) {
				System.out.println("Estado: Sana, hebras complementarias.");
			} else {
				System.out.println("Estado: Danada.");
			}
            
            break;
			
		case 3:
			
			
			celula1.dividirse();
			
			
			System.out.println("--------------------------------");
			System.out.println("Nuevas caracteristicas de la division de tu celula >> ");
			System.out.println("--------------------------------");
			System.out.println("- Celula del reino " + celula1.nombreReino);
			System.out.println("- Tiene una reserva de " + celula1.reservaATP + " ATP" );
			System.out.println("- Posee un tamano de " + celula1.tamano + " micrometros");
			System.out.println("- Sus hebras son " + celula1.hebraADN1 + " y " + celula1.hebraADN2 + " estan en... ");
			
			if(celula1.verificacionDaños() == true) {
				System.out.println("Estado: Sana, hebras complementarias.");
			} else {
				System.out.println("Estado: Danada.");
			}
			
			break;
			
		default:
			System.out.println("ERROR: opcion desconocida.");
			break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
