package ejercicio03;

public class Circulo {
	
	// Atributos
	double radio;

	// Constructor vacío
	public Circulo() {}
	
	// Constructor con parámetros
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	// Función que calcula la circunferencia
	double circunferencia() {
		// Variable donde se almacenará la circunferencia
		double circunferencia;
		
		// Calculamos la circunferencia
		circunferencia = 2 * Math.PI * radio;
		
		// Devolvemos la circunferencia
		return circunferencia;
	}

	// Función que calcula el área
	double area() {
		// Variable donde se almacenará el area
		double area;
		
		// Calculamos el area
		area = Math.PI * Math.pow(radio, 2);
		
		// Devolvemos el area
		return area;
	}
}
