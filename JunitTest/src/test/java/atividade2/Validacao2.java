package atividade2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import atividade4.Regressivo;
import atividade4.Smoke;

public class Validacao2 {
	
	@Category(Regressivo.class)
	@Test
	public void validarIgualdade() {
		
		assertEquals("Mensagem de igualdade", "azul", "azul");
		
		System.out.println("validarIgualdade");

			
	}
	
	@Category(Smoke.class)
	@Test
	public void validarNotIgualdade() {
		
		assertNotEquals("Mensagem de igualdade", "azul1", "azul");
		
		System.out.println("validarNotIgualdade");
			
	}

}
