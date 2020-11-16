package atividade5;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

public class RepetirTests {

	@Tag("Teste1")
	@RepeatedTest(2)
	public void repeticaoTest1() {
		System.out.println("Teste 1");

	}
	@Tag("Teste2")
	@RepeatedTest(2)
	public void repeticaoTest() {
		System.out.println("Teste 2");

	}

	@Tag("Teste3")
	@RepeatedTest(value = 3, name = "Repeticao de Teste: {currentRepetition}/{totalRepetitions}")
	public void repeticaoTest3() {
		System.out.println("Teste 3");
	}

}
