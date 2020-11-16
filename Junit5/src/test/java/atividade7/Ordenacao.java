package atividade7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Ordenacao {
	
	@Order(4)
	@Test 
	public void teste1() {
		System.out.println("TESTE 1");
	}

	@Order(3)
	@Test 
	public void teste2() {
		System.out.println("TESTE 2");
	}
	
	@Order(2)
	@Test 
	public void teste3() {
		System.out.println("TESTE 3");
	}
	
	@Order(1)
	@Test 
	public void teste4() {
		System.out.println("TESTE 4");
	}
}
