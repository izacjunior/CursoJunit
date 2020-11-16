package atividade3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrePosCondicao {

	
	@BeforeClass
	public static void metodoPreClass() {
		System.out.println("METODO DE PRE @BeforeClass");
	}
	
	@Before
	public void metodoPre() {
		System.out.println("METODO DE PRE @Before");
	}
	
	@Test
	public void metodoTeste1() {
		System.out.println("METODO DE TESTE 1");
	}
	
	@Test
	public void metodoTeste2() {
		System.out.println("METODO DE TESTE 2");
	}
	
	@After
	public void metodoPos() {
		System.out.println("METODO DE POS @After");
	}
	
	@AfterClass
	public static void metodoPosClass() {
		System.out.println("METODO DE POS @AfterClass");
	}
}
