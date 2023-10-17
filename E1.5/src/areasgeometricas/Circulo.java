package areasgeometricas;

public class Circulo extends FormaGeometrica{
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public void calcularArea(){
		System.out.println("Área do círculo: " + Math.PI * raio * raio);
	}

}
