package ejercicio02;

public class Rectangulo {
	// Atributos
	double alto;
	double ancho;
	
	// Constructor vacío
	public Rectangulo() {}
	
	// Constructor con parámetros
	public Rectangulo(double alto, double ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}
	
	// Función para calcular el perímetro
	double perimetro() {
		// Variable donde se almacenará el perímetro
		double perimetro;
		
		// Calculamos el perímetro
		perimetro = 2 * (alto + ancho);
		
		// Devolvemos el perímetro
		return perimetro;
	}
	
	// Función para calcular el área
	double area() {
		// Variable donde se almacenará el área
		double area;
		
		// Calculamos el área
		area = ancho * alto;
		
		// Devolvemos el área
		return area;
	}
	

}
