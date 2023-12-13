package ejercicio03;

import java.util.Scanner;

public class Principal {
	
	/*
	 * PRUEBA 1
	 * DATOS INTRODUCIDOS: 12, 0
	 * RESULTADO ESPERADO: ¡HASTA PRONTO!
	 * RESULTADO OBTENIDO: ¡HASTA PRONTO!
	 * 
	 * PRUEBA 2
	 * DATOS INTRODUCIDOS: 87, 1
	 * RESULTADO ESPERADO: 546.637121724624
	 * RESULTADO OBTENIDO: 546.637121724624
	 * 
	 * PRUEBA 3
	 * DATOS INTRODUCIDOS: 23, 2
	 * RESULTADO ESPERADO: 1661.9025137490005
	 * RESULTADO OBTENIDO: 1661.9025137490005
	 * */

	// Creamos el Scanner estático para poder usuarlo en las funciones
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Variable donde se almacenará la opción elegida
		int opcion;
		
		// Variable donde se almacenará el radio
		double radio;
		
		// Obtenemos el radio
		radio = pideRadio();
		
		// Le pedimos la opción
		opcion = menu();
		
		// Creamos el objeto circulo con el radio obtenido
		Circulo circulo = new Circulo(radio);
		
		// Mostramos el mensaje y el resultado según la opción elegida
		switch (opcion) {
			case 1:
				System.out.println("La circunferencia es: " + circulo.circunferencia());
				break;
			case 2:
				System.out.println("El área es: " + circulo.area());
				break;
			case 0:
				System.out.println("¡Hasta luego!");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
	static int menu() {
		// Variable donde se almacenará la opción elegida
		int opcion;
		
		// Pedimos mientras el número esté fuera del rango
		do {
			
			// Mostramos el mensaje con las opciones
			System.out.println("¿Qué deseas en hacer?"
					+ "\n1. Circunferencia"
					+ "\n2. Área"
					+ "\n0. Salir");
			
			// Leemos la opción introducida por el usuario y la almacenamos
			opcion = sc.nextInt();
			
		} while(opcion < 0 || opcion > 2);
		
		
		// Devolvemos la opción
		return opcion;
	}
	
	static double pideRadio() {
		// Variable donde se almacenará el radio introducido
		double radio;
		
		// Pedimos el radio y lo almacenamos
		System.out.println("Introduce el radio:");
		radio = sc.nextDouble();
		
		// Devolvemos el radio
		return radio;
	}
}
