package atividade11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassePaiJunit5 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BEFFOREALL junit 5 executado");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AFTERALL junit 5 executado");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BEFOREEACH junit 5 executado");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AFTEREACH junit 5 executado");

	}

	@Test
	void test() {
		System.out.println("METODO PAI junit 5 executado");

	}

}
