package atividade6;

import static org.junit.Assert.assertFalse;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {
	
	@Rule public Timeout timeGlobal = Timeout.seconds(1);
	
	@Test
	public void testeTime() {
		assertFalse(false);
	}
	
	@Test(timeout = 1000)
	public void testeTimeFalha() throws InterruptedException {
		Thread.sleep(900);
	}
	@Test
	public void testeTimeSucesso() throws InterruptedException {
		System.out.println("Sucesso");
	}
}
