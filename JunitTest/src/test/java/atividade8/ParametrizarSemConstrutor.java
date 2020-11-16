package atividade8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizarSemConstrutor {

	@Parameter(0)
	public String nome;
	@Parameter(1)
	public double peso;
	@Parameter(2)
	public double altura;
	@Parameter(3)
	public String resultado;

	@Parameters(name = "{0} - {1} - {2} - {3}")
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] { { "Carlos", 65, 1.80, "Carlos Obesidade grau II" },
				{ "Maria", 55, 1.60, "Maria Obesidade grau I" }, { "Paulo", 90, 1.90, "Paulo Obesidade grau III" },
				{ "Jose", 40, 1.70, "Jose Peso normal" },

		});
	}

	@Test
	public void validarImc() {
		assertEquals(resultado, validarIMC(peso, altura));
	}

	public String validarIMC(double peso, double altura) {

		String retorno = null;
		double resultado = peso / altura;

		if (resultado < 16) {
			retorno = nome + " Baixo peso muito grave";

		} else if (resultado >= 16 && resultado <= 16.99) {
			retorno = nome + " Baixo peso grave";

		} else if (resultado >= 17 && resultado <= 18.49) {
			retorno = nome + " Baixo peso";

		} else if (resultado >= 18.50 && resultado <= 24.99) {
			retorno = nome + " Peso normal";

		} else if (resultado >= 25 && resultado <= 29.99) {
			retorno = nome + " Sobrepeso";

		} else if (resultado >= 30 && resultado <= 34.99) {
			retorno = nome + " Obesidade grau I";
		} else if (resultado >= 35 && resultado <= 39.99) {
			retorno = nome + " Obesidade grau II";
		} else if (resultado >= 40) {
			retorno = nome + " Obesidade grau III";
		}
		return retorno;
	}

}
