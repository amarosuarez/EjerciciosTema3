package ejercicio03;

import java.util.Scanner;

public class Principal {

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
		
		// Mostramos el mensaje con las opciones
		System.out.println("¿Qué deseas en hacer?"
				+ "\n1. Circunferencia"
				+ "\n2. Área"
				+ "\n0. Salir");
		
		// Leemos la opción introducida por el usuario y la almacenamos
		opcion = sc.nextInt();
		
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
