package atividade2;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Validacao4 {
	
	@Test
	public void validarThat() {
		
		assertThat("Joao", is("Joao"));
		assertThat("Joao", is(not("Maria")));
		assertThat("Joao", not("Maria"));
		assertThat("Joao", is(not(nullValue())));
		assertThat(null, is(nullValue()));

		
		assertThat(100, isA(Integer.class));
		assertThat("Teste", isA(String.class));
		
		assertThat(50, greaterThan(40));
		assertThat(50, lessThan(100));

		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		assertThat(numeros, hasSize(5));

		assertThat(numeros, contains(1,2,3,4,5));
		assertThat(numeros, containsInAnyOrder(1,5,4,3,2));
		assertThat(numeros, hasItem(5));
		
		assertThat(numeros, hasItems(2,4));
		
		assertThat("Marcos", anyOf(is("Maria"), is("Marcos")));
		
		assertThat("Maria", allOf(startsWith("Ma"), endsWith("ia"), containsString("ar")));

	




		
	}

}
