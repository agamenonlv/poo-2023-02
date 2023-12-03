package impostoderenda;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pessoa {
	private String nome;
	private double salario;
	private int idade;
	private int numeroDependentes;
	
	Pessoa()
	{
		
	}

	Pessoa(String nome, double salario, int idade, int numeroDependentes)
	{
		this.setNome(nome);
		this.setSalario(salario);
		this.setIdade(idade);
		this.setNumeroDependentes(numeroDependentes);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (!nome.isEmpty())
		{
			if (!nome.isBlank())
			{
				if (nome.strip().length()>=3)
				{
					this.nome = nome.strip();
				}
			}
		}
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario >= 0)
		{
			this.salario = salario;
		}
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if ((idade >= 0) && (idade <= 123))
		{
			this.idade = idade;
		}
	}

	public int getNumeroDependentes() {
		return numeroDependentes;
	}
	public void setNumeroDependentes(int numeroDependentes) {
		if (numeroDependentes >= 0)
		{
			this.numeroDependentes = numeroDependentes;
		}
	}
	
	public double calculaImposto()
	{
		double imposto = 0;
		double salario = this.getSalario();
		int idade = this.idade;
		int numeroDependentes = this.getNumeroDependentes();
		
		if (idade >= 65)
		{
			return 0;
		}
		
		if (salario <= 1787.77)
		{
			imposto = 0.;
		}
		else if ((salario >= 1787.78) && (salario <=2679.29))
		{
			imposto = salario * 0.075 - 134.08;
		}
		else if ((salario >= 2679.30) && (salario <= 3572.43))
		{
			imposto = salario * 0.15 - 335.03;
		}
		else if ((salario >= 3572.44) && (salario <= 4463.81))
		{
			imposto = salario * 0.225 - 602.96;
		}
		else
		{
			imposto = salario * 0.275 - 826.15;
		}
		
		if (numeroDependentes != 0)
		{
			imposto -= (179.71 * numeroDependentes);
			
			if (imposto < 0)
			{
				imposto = 0;
			}
		}
		
		BigDecimal impostodecimal = new BigDecimal(imposto).setScale(2, RoundingMode.HALF_UP);
		imposto = impostodecimal.doubleValue();

		return imposto;
	}
}
