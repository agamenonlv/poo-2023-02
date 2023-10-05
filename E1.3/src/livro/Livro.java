package livro;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private String editora;
	
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public void setAutor(String autor)
	{
		this.autor = autor;
	}
	
	public String getAutor()
	{
		return this.autor;
	}
	
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	
	public int getAno()
	{
		return this.ano;
	}
	
	public void setEditora(String editora)
	{
		this.editora = editora;
	}
	
	public String getEditora()
	{
		return this.editora;
	}
	
//	@Override
	public String toString()
	{
		String cadeia;
		
		cadeia = this.titulo + "\n";
		cadeia += this.autor + "\n";
		cadeia += this.editora + ", " + this.ano + "\n";
		
		return cadeia;
	}
}
