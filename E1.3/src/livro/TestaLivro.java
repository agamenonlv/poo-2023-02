package livro;

public class TestaLivro {
	public static void main(String[] args)
	{
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		livro1.setTitulo("A Queda de Numenor");
		livro1.setAutor("J.R.R. Tolkien");
		livro1.setAno(2022);
		livro1.setEditora("HarperCollins");
		
		livro2.setTitulo("O Pequeno Príncipe");
		livro2.setAutor("Antone de Saint-Exupéry");
		livro2.setAno(2015);
		livro2.setEditora("Via Leitura");
		
		livro3.setTitulo("A Revolução dos Bichos");
		livro3.setAutor("George Orwell");
		livro3.setAno(2021);
		livro3.setEditora("Via Leitura");
		
		System.out.println(livro1.toString());
		System.out.println(livro2.toString());
		System.out.println(livro3.toString());
	}
}
