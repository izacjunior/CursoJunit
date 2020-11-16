package atividade1;

import org.junit.Test;

public class MetodosJunitNaoPermite {

	// @Test
	public String metodoNaoPermitidoString() {
		return null;

	}

	//@Test
	public Double metodoNaoPermitidoDouble() {
		return null;

	}

	//@Test
	protected void metodoNaoPermitidoProtected() {

	}
	
	@Test
	private void metodoNaoPermitidoPrivate() {

	}
}
