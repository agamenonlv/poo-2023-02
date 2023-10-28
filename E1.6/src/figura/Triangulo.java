package figura;

public class Triangulo extends Figura{

	double base;
	double lado1;
	double lado2;
	double altura;

	public Triangulo() {
	}
	
	public Triangulo(double base, double lado1, double lado2, double altura) {
		this.altura = altura;
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public void area() {
		System.out.println("Área do triângulo: " + (this.base * this.altura)/2);
	}

	@Override
	public void perimetro() {
		System.out.println("Perímetro do triângulo: " + (this.base + this.lado1 + this.lado2));
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String desenhar() {
		return "Desenhando um TRIANGULO";
	}
}
