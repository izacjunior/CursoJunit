
package atividade2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import atividade4.Regressivo;
import atividade4.Smoke;

public class Validacao1 {

	@Category(Regressivo.class)
	@Test
	public void validarTrue() {

		String texto = "valor";
		
		boolean status = true;
		assertTrue(status);
		
		assertTrue("Validcao ASSERT TRUE", status);

		assertTrue("validacao de string", texto.contains("valor"));

		assertTrue("validacao de string", texto.equalsIgnoreCase("VALOR"));

		assertTrue("", 5 > 3);
		
		System.out.println("validarTrue");

	}

	@Category(Smoke.class)
	@Test
	public void validarFalse() {

		boolean status = false;
		assertFalse(status);
		
		assertFalse("Validcao ASSERT FALSE", status);

		System.out.println("validarFalse");
	}

}
