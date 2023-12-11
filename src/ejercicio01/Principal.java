package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	/*
	 * PRUEBA 1
	 * DATOS INTRODUCIDOS: 1, 2,5, 4
	 * RESULTADO ESPERADO: 6,5
	 * RESULTADO OBTENIDO: 6,5
	 * 
	 * PRUEBA 2
	 * DATOS INTRODUCIDOS: 4, 8, 225
	 * RESULTADO ESPERADO: 0.035555555555555556
	 * RESULTADO OBTENIDO: 0.035555555555555556
	 * 
	 * PRUEBA 3
	 * DATOS INTRODUCIDOS: 0, 12, 33
	 * RESULTADO ESPERADO: ¡HASTA PRONTO!
	 * RESULTADO OBTENIDO: ¡HASTA PRONTO!
	 * 
	 * PRUEBA 4
	 * DATOS INTRODUCIDOS: 3, 122, 5
	 * RESULTADO ESPERADO: 610
	 * RESULTADO OBTENIDO: 610
	 * */
	

	// Creamos un Scanner estático para que todas las funciones lo puedan usar
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variable donde se almacenará la opción elegida
		int opcion;

		// Variables donde se almacenarán los números
		double num1, num2;

		// Obtenemos la operación elegida del menú
		opcion = menu();

		// Le pedimos al usuario los números y los almacenamos
		num1 = pideNumero();
		num2 = pideNumero();

		// Creamos un nuevo objeto Operaciones con los números obtenidos
		Operaciones op = new Operaciones(num1, num2);

		// Según la opcion elegida por el usuario mostramos un mensaje y el resultado de la operación
		switch (opcion) {
			case 1:
				System.out.println("El resultado de la suma es: " + op.suma());
				break;
			case 2:
				System.out.println("El resultado de la resta es: " + op.resta());
				break;
			case 3:
				System.out.println("El resultado de la multiplicación es: " + op.multiplicacion());
				break;
			case 4:
				System.out.println("El resultado de la división es: " + op.division());
				break;
			case 5:
				System.out.println("El máximo es: " + op.maximo());
				break;
			case 6:
				System.out.println("El mínimo es: " + op.minimo());
				break;
			case 0:
				System.out.println("¡Hasta pronto!");
				break;
			
		}

		// Cerramos el Scanner
		sc.close();
	}

	// Función para mostrar el menú
	public static int menu() {
		// Creamos la variable donde se almacenará la opción elegida
		int opcion = 0;

		// Mostramos el mensaje con las opciones por pantalla 
		System.out.println("Elige que operación deseas hacer:" + "\n1. Suma\n2. Resta\n3. Multiplicación"
				+ "\n4. División\n5. Máximo\n6. Mínimo" + "\n0. Salir");

		// Leemos la opción elegida por el usuario
		opcion = sc.nextInt();

		// Devolvemos la opción elegida
		return opcion;
	}

	// Función para pedir el número
	public static double pideNumero() {
		// Creamos la variable donde se almacenrá el número introducido
		double num = 0;
		
		// Creamos un auxiliar que nos permitirá salir del bucle
		boolean numValido = false;

		// Creamos el bucle que nos preguntará el número hasta que introduzcamos un dato correcto
		do {
			// Comprobamos que introduce un dato correcto
			try {
				// Mostramos el mensaje por pantalla
				System.out.println("Introduzca un número (puede contener decimales)");
				// Leemos el número introducido por el usuario
				num = sc.nextDouble(); 
				// Asignamos el auxiliar a true para salir del bucle
				numValido = true;

			} catch (InputMismatchException e) {
				// Mostramos el mensaje de que el dato es erróneo
				System.out.println("Datos erróneos");
				// Limpiamos el Scanner
				sc.nextLine();
			}

		} while (!numValido);

		// Devolvemos el número introducido
		return num;
	}

}
