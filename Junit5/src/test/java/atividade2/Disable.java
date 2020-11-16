package atividade2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Disable {
	
	@Disabled("Nao é para rodar esse metodo")
	@Test
	public void metodoTeste1() {
		System.out.println("Teste 1");
	}
	
	@Test
	public void metodoTeste2() {
		System.out.println("Teste 2");
	}
	
	@RepeatedTest(5)
	public void metodoTeste3() {
		System.out.println("Teste 2");
	}
}
