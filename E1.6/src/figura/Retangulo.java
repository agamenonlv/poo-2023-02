package figura;

public class Retangulo extends Quadrado{

	double altura;

	public Retangulo() {
		super();
	}

	public Retangulo(double lado, double altura) {
		super(lado);
		this.altura = altura;
	}
	
	@Override
	public void area() {
		System.out.println("Área do retângulo: " + (this.altura * this.lado));
	}
	
	@Override
	public void perimetro() {
		System.out.println("Perímetro do retângulo: " + (2 * (this.altura + this.lado)));
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String desenhar() {
		return "Desenhando um RETANGULO";
	}
}
