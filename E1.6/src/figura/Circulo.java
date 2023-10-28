package figura;

public class Circulo extends Figura{

	double raio;

	public Circulo() {
	}
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public void area() {
		System.out.println("Área do círculo: " + (3.14 * this.raio * this.raio));
	}

	@Override
	public void perimetro() {
		System.out.println("Perímetro do círculo: " + (2 * 3.14 + this.raio));
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return "Desenhando um CIRCULO";
	}
}
