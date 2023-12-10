package ejercicio01;

public class Operaciones {

	// Atributos
	double num1;
	double num2;
	
	// Constructor vacío
	public Operaciones() {}
	
	// Constructor con parámetros
	public Operaciones(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	// Función que calcula la suma
	double suma() {
		// Creamos la variable donde se almacenará el resultado
		double suma;
		
		// Hacemos la suma
		suma = num1 + num2;
		
		// Devolvemos el resultado
		return suma;
	}
	
	// Función que calcula la resta
	double resta() {
		// Creamos la variable donde se almacenará el resultado
		double resta;
		
		// Hacemos la resta
		resta = num1 - num2;
		
		// Devolvemos el resultado
		return resta;
	}
	
	// Función que calcula la multiplicación
	double multiplicacion() {
		// Creamos la variable donde se almacenará el resultado
		double mult;
		
		// Hacemos la multiplicación
		mult = num1 * num2;
		
		// Devolvemos el resultado
		return mult;
	}
	
	// Función que calcula la división
	double division() {
		// Creamos la variable donde se almacenará el resultado
		double div;
		
		// Hacemos la división
		div = num1 / num2;
		
		// Devolvemos el resultado
		return div;
	}
	
	// Función que calcula el máximo
	double maximo() {
		// Creamos la variable donde se almacenará el máximo
		double max;
		
		// Obtenemos el máximo
		max = Math.max(num1, num2);
		
		// Devolvemos el máximo
		return max;
	}
	
	// Función que calcula el mínimo
	double minimo() {
		// Creamos la variable donde se almacenará el mínimo
		double min;
		
		// Obtenemos el mínimo
		min = Math.min(num1, num2);
		
		return min;
	}
	
}
