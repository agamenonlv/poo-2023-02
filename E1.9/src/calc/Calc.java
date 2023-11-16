package calc;

public class Calc {
    int n1;
    int n2;

    public double somar() {
    	if ((n1 < 0) || (n2 < 0))
    	{
    		throw new NumeroNegativo();
    	}
        return n1 + n2;
    }

    public double diminuir() {
    	if ((n1 < 0) || (n2 < 0))
    	{
    		throw new NumeroNegativo();
    	}
        return n1 - n2;
    }

    public double multiplicar() {
    	if ((n1 < 0) || (n2 < 0))
    	{
    		throw new NumeroNegativo();
    	}
        return n1 * n2;
    }

    public double dividir() {
    	if ((n1 < 0) || (n2 < 0))
    	{
    		throw new NumeroNegativo();
    	}
        return n1 / n2;
    }
}
