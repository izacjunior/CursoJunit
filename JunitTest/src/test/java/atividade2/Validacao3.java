package atividade2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Validacao3 {
	
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
	
	
	@Test
	public void validacaoNull() {
		
		String valor = null;
		
		assertNull(valor);
		
		System.out.println("validacaoNull");

		
	}
	
	@Test
	public void validacaoNotNull() {
		
		String valor = "teste";
		assertNotNull(valor);
				
		System.out.println("validacaoNotNull");

	}
	
	@Test
	public void validarArray() {
		
		assertArrayEquals("mensagem", cars, cars1);
		
		System.out.println("validarArray");

	}

}
