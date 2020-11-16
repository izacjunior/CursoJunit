package atividade5;

import org.junit.Ignore;
import org.junit.Test;

public class TesteIgnore {
	
	@Test
	public void testeMetodo() {
		
		System.out.println("Teste 1");
		
	}

	@Ignore(value = "Teste ignorado com sucesso")
	@Test
	public void testeIgnorado() {
		
		System.out.println("Teste Ignorado");
		
	}
	
	@Test
	public void testeMetodo2() {
		
		System.out.println("Teste 2");
		
	}
}
