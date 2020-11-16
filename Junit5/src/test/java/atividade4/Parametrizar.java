package atividade4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class Parametrizar {

	enum ListaNomes {
		Maria, Jose, Carlos, Paulo
	}

	@ParameterizedTest
	@ValueSource(strings = { "Teste1", "Teste2" })
	public void testeParametrizado(String texto) {
		assertNotNull(texto);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5 })
	public void Bnumeros(int valor) {
		assertTrue(valor > 0 && valor < 10);

	}

	@ParameterizedTest(name = "Numeros validados {index}: {0}")
	@ValueSource(ints = { 5, 6, 7, 8, 9 })
	public void AnumerosInteiros(int valores) {
		assertNotNull(valores, "NUMEROS IMPRESSOS");

	}

	@ParameterizedTest
	@CsvFileSource(resources = "/atividade4/nomes.csv")
	public void nomes(String nome) {
		System.out.println(nome);

	}

	@ParameterizedTest
	@EnumSource(ListaNomes.class)
	public void nomes(ListaNomes nome) {
		System.out.println(nome);

	}

	@ParameterizedTest
	@NullSource
	@ValueSource(strings = { "" })
	public void nulos(String valores) {
		System.out.println(valores);

	}

	@ParameterizedTest
	@CsvSource({ "java, 5", "junit, 5", "parametrizar, 12" })
	public void matriz(String texto, int quantidade) {
		System.out.println(texto);
		System.out.println(quantidade);
		assertEquals(quantidade, texto.length());

	}

}
