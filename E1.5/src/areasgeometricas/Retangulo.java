package areasgeometricas;

public class Retangulo extends FormaGeometrica{
	
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public void calcularArea() {
		System.out.println("Área do retângulo: " + largura*altura);
	}
}
