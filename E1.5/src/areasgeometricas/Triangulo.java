package areasgeometricas;

public class Triangulo extends FormaGeometrica{
	
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = base;
	}
	
	public void calcularArea() {
		System.out.println("Área do triângulo: " + (base * altura)/2);
	}

}
