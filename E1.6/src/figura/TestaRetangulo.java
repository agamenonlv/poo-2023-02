package figura;

public class TestaRetangulo {

	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo();
		Retangulo retangulo2 = new Retangulo(2,4);
		
		//Seta o objeto retangulo1
		retangulo1.setAltura(2);
		retangulo1.setLado(4);
		
		//Exibe as informações do retangulo1
		System.out.println("Dados do retângulo 1");
		System.out.println("Altura: " + retangulo1.getAltura() + " cm");
		System.out.println("Lado: " + retangulo1.getLado() + " cm");
		retangulo1.area();
		retangulo1.perimetro();
		System.out.println(retangulo1.desenhar());
		
		System.out.println();
		
		//Exibe as informações do retangulo2
		System.out.println("Dados do retângulo 2");
		System.out.println("Altura: " + retangulo2.getAltura() + " cm");
		System.out.println("Lado: " + retangulo2.getLado() + " cm");
		retangulo2.area();
		retangulo2.perimetro();
		System.out.println(retangulo2.desenhar());

	}

}
