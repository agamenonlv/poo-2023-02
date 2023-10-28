package figura;

public class Quadrado extends Figura{
	double lado;
	
	public Quadrado() {
	}
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public void area() {
		System.out.println("Área do quadrado: " + this.lado * this.lado);
	}

	@Override
	public void perimetro() {
		System.out.println("Perímetro do quadrado: " + 4 * this.lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public String desenhar() {
		return "Desenhando um QUADRADO";
	}
}
