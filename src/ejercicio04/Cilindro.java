package ejercicio04;

public class Cilindro {

	// Atributos
	double radioBase;
	double altura;
	
	// Constructor vacío
	public Cilindro() {}
	
	// Constructor con parámetros
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}
	
	// Función que calcula el volumen del cilindro
	double volumen() {
		// Variable donde se almacenará el volumen
		double volumen;
		
		// Calculamos el volumen
		volumen = Math.PI * Math.pow(radioBase, 2) * altura;
		
		// Devolvemos el volumen obtenido
		return volumen;
	}
	
	// Función que calcula el área del cilindro
	double area() {
		// Variable donde se almacenará el área
		double area;
		
		// Calculamos el area
		area = 2 * Math.PI * radioBase* (radioBase + altura);
		
		// Devolvemos el area obtenido
		return area;
	}
	
}
