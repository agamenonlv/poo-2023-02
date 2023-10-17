package areasgeometricas;

public class CalculadoraArea {

	public static void main(String[] args) {
		FormaGeometrica[] forma = new FormaGeometrica[3];
		
		forma[0] = new Circulo(5);
		forma[1] = new Retangulo(2,5);
		forma[2] = new Triangulo(4,7);
		
		for(int i = 0; i < 3; i++)
		{
			forma[i].calcularArea();
		}
	}

}
