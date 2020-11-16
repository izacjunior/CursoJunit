package atividade11;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClassePaiJunit4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BEFFORECLASS junit 4 executado");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AFTERCLASS junit 4 executado");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("BEFFORE junit 4 executado");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("AFTER junit 4 executado");

	}

	@Test
	public void test() {
		System.out.println("METODO PAI junit 4 executado");

	}

}
