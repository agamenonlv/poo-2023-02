package calc;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0,00");
        Calc c = new Calc();
        
        try
        {
        	c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Entre com o primeiro número:"));
        }
        catch (NumberFormatException e)
        {
        	JOptionPane.showMessageDialog(null, "Valor inválido");
        	return;
        }
        
        try {
        	c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Entre com o segundo número:"));
        }
        catch (NumberFormatException e)
        {
        	JOptionPane.showMessageDialog(null, "Valor inválido");
        	return;
        }
        
        try {
        	try {
        		JOptionPane.showMessageDialog(null,
                        "Soma : " + dc.format(c.somar()));
        	}
        	catch (NumeroNegativo e)
        	{
        		JOptionPane.showMessageDialog(null, e.getMessage());
        		return;
        	}
        	
        	try {
        		JOptionPane.showMessageDialog(null,
                        "Subtração : " + dc.format(c.diminuir()));
        	}
        	catch (NumeroNegativo e)
        	{
        		JOptionPane.showMessageDialog(null, e.getMessage());
        		return;
        	}
        	
        	try {
        		JOptionPane.showMessageDialog(null,
                        "Multiplicação : " + dc.format(c.multiplicar()));
        	}
        	catch (NumeroNegativo e)
        	{
        		JOptionPane.showMessageDialog(null, e.getMessage());
        		return;
        	}
        	
        	try
            {
            	JOptionPane.showMessageDialog(null,
                        "Divisão : " + dc.format(c.dividir()));
            }
            catch (ArithmeticException e)
            {
            	JOptionPane.showMessageDialog(null, "Erro divisão por zero");
            }
        }
        catch (Exception e)
        {
        	JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
