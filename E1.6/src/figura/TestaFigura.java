package figura;

public class TestaFigura {

	public static void main(String[] args) {
		//Cria dois objetos circulo e explora seus atributos e métodos
		Circulo circulo1 = new Circulo();
		
		circulo1.setRaio(5);
		
		System.out.println("Medida do raio do círculo: " + circulo1.getRaio());
		
		circulo1.area();
		circulo1.perimetro();
		
		System.out.println(circulo1.desenhar());
		
		System.out.println();
		
		Circulo circulo2 = new Circulo(2);
		
		System.out.println("Medida do raio do círculo: " + circulo2.getRaio());
		
		circulo2.area();
		circulo2.perimetro();
		
		System.out.println(circulo2.desenhar());
		
		System.out.println();
		
		//Cria dois objetos quadrado e explora seus atributos e métodos
		Quadrado quadrado1 = new Quadrado();
		
		quadrado1.setLado(5);
		
		System.out.println("Medida do lado do quadrado: " + quadrado1.getLado());
		
		quadrado1.area();
		quadrado1.perimetro();
		
		System.out.println(quadrado1.desenhar());
		
		System.out.println();
		
		Quadrado quadrado2 = new Quadrado(3);
		
		System.out.println("Medida do lado do quadrado: " + quadrado2.getLado());
		
		quadrado2.area();
		quadrado2.perimetro();
		
		System.out.println(quadrado2.desenhar());
		
		System.out.println();
		
		//Cria dois objetos triangulo e explora seus atributos e métodos
		Triangulo triangulo1 = new Triangulo();
		
		triangulo1.setAltura(4);
		triangulo1.setBase(10);
		triangulo1.setLado1(5.66);
		triangulo1.setLado2(7.21);
		
		System.out.println("Dados do triângulo");
		System.out.println("Medida da base: " + triangulo1.getBase());
		System.out.println("Medida de um dos lados: " + triangulo1.getLado1());
		System.out.println("Medida do outro lado: " + triangulo1.getLado2());
		System.out.println("Medida da altura: " + triangulo1.getAltura());
		
		triangulo1.area();
		triangulo1.perimetro();
		
		System.out.println(triangulo1.desenhar());
		
		System.out.println();
		
		Triangulo triangulo2 = new Triangulo(8, 6.32, 8.49, 6);
		
		System.out.println("Dados do triângulo");
		System.out.println("Medida da base: " + triangulo2.getBase());
		System.out.println("Medida de um dos lados: " + triangulo2.getLado1());
		System.out.println("Medida do outro lado: " + triangulo2.getLado2());
		System.out.println("Medida da altura: " + triangulo2.getAltura());
		
		triangulo2.area();
		triangulo2.perimetro();
		
		System.out.println(triangulo2.desenhar());
		
		System.out.println();
		
		//Cria dois objetos retangulo e explora seus atributos e métodos
		Retangulo retangulo1 = new Retangulo();
	
		retangulo1.setAltura(2);
		retangulo1.setLado(4);

		System.out.println("Dados do retângulo 1");
		System.out.println("Altura: " + retangulo1.getAltura() + " cm");
		System.out.println("Lado: " + retangulo1.getLado() + " cm");

		retangulo1.area();
		retangulo1.perimetro();
		
		System.out.println(retangulo1.desenhar());
		
		System.out.println();

		Retangulo retangulo2 = new Retangulo(2,4);

		System.out.println("Dados do retângulo 2");
		System.out.println("Altura: " + retangulo2.getAltura() + " cm");
		System.out.println("Lado: " + retangulo2.getLado() + " cm");

		retangulo2.area();
		retangulo2.perimetro();
		
		System.out.println(retangulo2.desenhar());
		
		System.out.println();
		
		//Cria duas listas de objetos e explora seus atributos e métodos

		Figura[] listafigura1 = new Figura[4];
		
		//Cria uma lista de figuras usando os construtores padrões.
		listafigura1[0] = new Quadrado();
		listafigura1[1] = new Triangulo();
		listafigura1[2] = new Circulo();
		listafigura1[3] = new Retangulo();
		
		//Entra com os valores das medidas das figuras
		((Quadrado) listafigura1[0]).setLado(5);
		((Triangulo) listafigura1[1]).setAltura(4);
		((Triangulo) listafigura1[1]).setBase(10);
		((Triangulo) listafigura1[1]).setLado1(5.66);
		((Triangulo) listafigura1[1]).setLado2(7.21);
		((Circulo) listafigura1[2]).setRaio(5);
		((Retangulo) listafigura1[3]).setLado(2);
		((Retangulo) listafigura1[3]).setAltura(4);
		
		//Cálculo das áreas e perímetros
		for (int i = 0; i < 4; i++) {
			listafigura1[i].area();
			listafigura1[i].perimetro();
			System.out.println(listafigura1[1].desenhar());
			System.out.println();
		}

		Figura[] listafigura2 = new Figura[4];
		
		//Cria uma lista de figuras usando os construtores padrões.
		listafigura2[0] = new Quadrado(2);
		listafigura2[1] = new Triangulo(8, 6.32, 8.49, 6);
		listafigura2[2] = new Circulo(3);
		listafigura2[3] = new Retangulo(3,7);
		
		//Cálculo das áreas e perímetros
		for (int i = 0; i < 4; i++) {
			listafigura2[i].area();
			listafigura2[i].perimetro();
			System.out.println(listafigura2[i].desenhar());
			
			System.out.println();
		}
	}

}
