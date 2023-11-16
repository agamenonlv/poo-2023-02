package calc;

public class NumeroNegativo extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public NumeroNegativo()
	{
		super("Entrada de número negativo");
	}
}
