package ejercicio04;

import java.util.Scanner;

public class Principal {
	
	/*
	 * PRUEBA 1
	 * DATOS INTRODUCIDOS: 12, 33, 2
	 * RESULTADO ESPERADO: 3392.9200658769764
	 * RESULTADO OBTENIDO: 3392.9200658769764
	 * 
	 * PRUEBA 2
	 * DATOS INTRODUCIDOS: 77, 105, 1
	 * RESULTADO ESPERADO: 1955782.7985290578
	 * RESULTADO OBTENIDO: 1955782.7985290578
	 * 
	 * PRUEBA 3
	 * DATOS INTRODUCIDOS: 11, 12, 0
	 * RESULTADO ESPERADO: ¡HASTA PRONTO!
	 * RESULTADO OBTENIDO: ¡HASTA PRONTO!
	 * */

	// Creamos el Scanner estático para poder usarlo en las funciones
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Variable donde se almacenará la opción elegida
		int opcion;
		
		// Variable donde se almacenará el radio base
		double radioBase;
		
		// Variable donde se almacenará la altura
		double altura;
		
		// Obtenemos el radio de la base
		radioBase = pideRadioBase();
		
		// Obtenemos la altura
		altura = pideAltura();
		
		// Obtenemos la opción elegida
		opcion = menu();
		
		// Creamos el objeto Cilindro con los datos obtenidos
		Cilindro cilindro = new Cilindro(radioBase, altura);
		
		// Según la opción elegida mostramos el mensaje y el resultado
		switch(opcion) {
			case 1:
				System.out.println("El volumen es: " + cilindro.volumen());
				break;
			case 2:
				System.out.println("El área es: " + cilindro.area());
				break;
			case 0:
				System.out.println("¡Hasta pronto!");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
	static int menu() {
		// Variable donde se almacenará la opción
		int opcion;
		
		// Mostramos las opciones
		System.out.println("¿Qué deseas hacer?\n"
				+ "1. Volumen\n"
				+ "2. Área\n"
				+ "0. Salir");
		
		// Pedimos y guardamos la opción elegida
		opcion = sc.nextInt();
		
		// Devolvemos la opción elegida
		return opcion;
	}
	
	static double pideRadioBase() {
		// Variable donde se almacenará el radio base
		double radioBase;
		
		// Pedimos y almacenamos el radio base
		System.out.println("¿Cuál es el radio de la base?");
		radioBase = sc.nextDouble();
		
		// Devolvemos el radio base
		return radioBase;
	}
	
	static double pideAltura() {
		// Variable donde se almacenará la altura
		double altura;
		
		// Pedimos y almacenamos la altura
		System.out.println("¿Cuál es la altura?");
		altura = sc.nextDouble();
		
		// Devolvemos la altura
		return altura;
	}
	
}
