package atividade10;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class PrePosCondicao {

	@Test
	public void metodoTeste() {

		System.out.println("METODO DE TESTE");
	}

	@BeforeAll
	public static void metodoRodaAntesTodosTeste() {

		System.out.println("METODO DE TESTE - BeforeAll");
	}

	@BeforeEach
	public void metodoRodaAntesTeste() {

		System.out.println("METODO DE TESTE - BeforeEach");
	}

	@AfterEach
	public void metodoRodaDepoisTeste() {

		System.out.println("METODO DE TESTE - AfterEach");
	}

	@AfterAll
	public static void metodoRodaDepoisTodosTeste() {

		System.out.println("METODO DE TESTE - AfterAll");
	}

	@Test
	public void metodoTeste2() {
		System.out.println("METODO DE TESTE - 2");

	}
}
