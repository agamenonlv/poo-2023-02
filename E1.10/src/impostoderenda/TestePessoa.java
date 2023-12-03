package impostoderenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePessoa {

	@Test
	void testaNomeValido()
	{
		Pessoa pessoa = new Pessoa();
		String nomeEsperado = "Agamenon Lima";
		
		pessoa.setNome(nomeEsperado);
		String nomeRetornado = pessoa.getNome();
		
		assertEquals(nomeEsperado,nomeRetornado);
	}
	
	@Test
	void testaSalario()
	{
		Pessoa pessoa = new Pessoa();
		double salarioEsperado = 50000;
		
		pessoa.setSalario(salarioEsperado);
		double salarioRetornado = pessoa.getSalario();
		
		assertEquals(salarioEsperado, salarioRetornado);
	}
	
	@Test
	void testaIdade()
	{
		Pessoa pessoa = new Pessoa();
		int idadeEsperada = 60;
		
		pessoa.setIdade(idadeEsperada);
		int idadeRetornada = pessoa.getIdade();
		
		assertEquals(idadeEsperada, idadeRetornada);
	}
	
	@Test
	void testaNumeroDependentes()
	{
		Pessoa pessoa = new Pessoa();
		int numeroDependentesEperado = 5;
		
		pessoa.setNumeroDependentes(numeroDependentesEperado);
		int numeroDependentesRetornado = pessoa.getNumeroDependentes();
		
		assertEquals(numeroDependentesEperado, numeroDependentesRetornado);
	}

	@Test
	void testaPessoa()
	{
		String nomeEsperado = "Agamenon Vale";
		double salarioEsperado = 50000;
		int idadeEsperada = 30;
		int numeroDependentesEsperado = 2;
		Pessoa pessoaEsperada = new Pessoa(nomeEsperado, salarioEsperado, idadeEsperada, numeroDependentesEsperado);
		
		String nomeRetornado = pessoaEsperada.getNome();
		double salarioRetornado = pessoaEsperada.getSalario();
		int idadeRetornada = pessoaEsperada.getIdade();
		int numeroDependentesRetornado = pessoaEsperada.getNumeroDependentes();
		
		assertEquals(nomeEsperado, nomeRetornado);
		assertEquals(salarioEsperado, salarioRetornado);
		assertEquals(idadeEsperada, idadeRetornada);
		assertEquals(numeroDependentesEsperado, numeroDependentesRetornado);
	}
	
	@Test
	void testaImpostoFaixa1()
	{
		Pessoa pessoa1 = new Pessoa("Agamenon Lima", 0, 52, 2);
		Pessoa pessoa2 = new Pessoa("Agamenon Vale", 1000, 60, 0);
		Pessoa pessoa3 = new Pessoa("Agamenon Vale", 1787.77, 52, 1);
		
		double impostoEsperado = 0;
		
		assertEquals(impostoEsperado, pessoa1.calculaImposto());
		assertEquals(impostoEsperado, pessoa2.calculaImposto());
		assertEquals(impostoEsperado, pessoa3.calculaImposto());
	}
	
	@Test
	void testaImpostoFaixa2()
	{
		Pessoa pessoa1 = new Pessoa("Agamenon", 1787.78, 65, 0);
		Pessoa pessoa2 = new Pessoa("Agamenon", 1787.78,52,0);
		Pessoa pessoa3 = new Pessoa("Agamenon", 2000, 52, 0);
		Pessoa pessoa4 = new Pessoa("Agamenon", 2000, 52, 1);
		Pessoa pessoa5 = new Pessoa("Agamenon", 2500, 52, 2);
		Pessoa pessoa6 = new Pessoa("Agamenon", 2500, 65 , 2);
		Pessoa pessoa7 = new Pessoa("Agamenon", 2679.29, 52, 0);
		Pessoa pessoa8 = new Pessoa("Agamenon", 2679.29, 70, 2);
		
		assertEquals(0, pessoa1.calculaImposto());
		assertEquals(0, pessoa2.calculaImposto());
		assertEquals(15.92, pessoa3.calculaImposto());
		assertEquals(0, pessoa4.calculaImposto());
		assertEquals(0, pessoa5.calculaImposto());
		assertEquals(0, pessoa6.calculaImposto());
		assertEquals(66.87, pessoa7.calculaImposto());
		assertEquals(0, pessoa8.calculaImposto());
	}
	
	@Test
	void testaImpostoFaixa3()
	{
		Pessoa pessoa1 = new Pessoa("Agamenon", 2679.30, 52, 0);
		Pessoa pessoa2 = new Pessoa("Agamenon", 2679.30, 52, 1);
		Pessoa pessoa3 = new Pessoa("Agamenon", 3000, 52, 0);
		Pessoa pessoa4 = new Pessoa("Agamenon", 3500, 52, 0);
		Pessoa pessoa5 = new Pessoa("Agamenon", 3500, 52, 1);
		Pessoa pessoa6 = new Pessoa("Agamenon", 3500, 52, 2);
		Pessoa pessoa7 = new Pessoa("Agamenon", 3500, 70, 0);
		Pessoa pessoa8 = new Pessoa("Agamenon", 3572.43, 52, 0);
		Pessoa pessoa9 = new Pessoa("Agamenon", 3572.43, 52, 1);
		Pessoa pessoa10 = new Pessoa("Agamenon", 3572.43, 52, 2);
		Pessoa pessoa11 = new Pessoa("Agamenon", 3572.43, 80, 0);

		assertEquals(66.87, pessoa1.calculaImposto());
		assertEquals(0, pessoa2.calculaImposto());
		assertEquals(114.97, pessoa3.calculaImposto());
		assertEquals(189.97, pessoa4.calculaImposto());
		assertEquals(10.26, pessoa5.calculaImposto());
		assertEquals(0, pessoa6.calculaImposto());
		assertEquals(0, pessoa7.calculaImposto());
		assertEquals(200.83, pessoa8.calculaImposto());
		assertEquals(21.12, pessoa9.calculaImposto());
		assertEquals(0, pessoa10.calculaImposto());
		assertEquals(0, pessoa11.calculaImposto());
	}
	
	@Test
	void testaImpostoFaixa4()
	{
		Pessoa pessoa1 = new Pessoa("Agamenon", 3572.44, 52, 0);
		Pessoa pessoa2 = new Pessoa("Agamenon", 4400, 52, 0);
		Pessoa pessoa3 = new Pessoa("Agamenon", 4400, 52, 1);
		Pessoa pessoa4 = new Pessoa("Agamenon", 4400, 52, 2);
		Pessoa pessoa5 = new Pessoa("Agamenon", 4400, 52, 3);
		Pessoa pessoa6 = new Pessoa("Agamenon", 4463.81, 52, 0);
		Pessoa pessoa7 = new Pessoa("Agamenon", 4463.81, 52, 2);
		Pessoa pessoa8 = new Pessoa("Agamenon", 4463.81, 52, 3);
		Pessoa pessoa9 = new Pessoa("Agamenon", 4463.81, 65, 0);
		
		assertEquals(200.84, pessoa1.calculaImposto());
		assertEquals(387.04, pessoa2.calculaImposto());
		assertEquals(207.33, pessoa3.calculaImposto());
		assertEquals(27.62, pessoa4.calculaImposto());
		assertEquals(0, pessoa5.calculaImposto());
		assertEquals(401.40, pessoa6.calculaImposto());
		assertEquals(41.98, pessoa7.calculaImposto());
		assertEquals(0, pessoa8.calculaImposto());
		assertEquals(0, pessoa9.calculaImposto());
	}
	
	@Test
	void testaImpostoFaixa5()
	{
		Pessoa pessoa1 = new Pessoa("Agamenon", 4463.82, 52, 0);
		Pessoa pessoa2 = new Pessoa("Agamenon", 4463.82, 52, 1);
		Pessoa pessoa3 = new Pessoa("Agamenon", 4463.82, 52, 2);
		Pessoa pessoa4 = new Pessoa("Agamenon", 4463.82, 52, 3);
		Pessoa pessoa5 = new Pessoa("Agamenon", 20000, 52, 0);
		Pessoa pessoa6 = new Pessoa("Agamenon", 20000, 52, 4);
		Pessoa pessoa7 = new Pessoa("Agamenon", 20000, 65, 4);
		
		assertEquals(401.40, pessoa1.calculaImposto());
		assertEquals(221.69, pessoa2.calculaImposto());
		assertEquals(41.98, pessoa3.calculaImposto());
		assertEquals(0, pessoa4.calculaImposto());
		assertEquals(4673.85, pessoa5.calculaImposto());
		assertEquals(3955.01, pessoa6.calculaImposto());
		assertEquals(0, pessoa7.calculaImposto());
	}
}
