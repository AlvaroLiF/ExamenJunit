package cuentas;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMovimiento extends CoreMatchers{
	
	private static Movimiento mov;
	
	@BeforeAll
	static void iniciar() {
		mov = new Movimiento();
	}
	
	@AfterAll
	static void anular() {
		mov = null;
	}

	@Test
	void TestSetConcepto() {
		mov.setConcepto("Aliexpress");
		assertThat("Aliexpress",equalTo(mov.getConcepto()));
	}

	@Test
	void TestSetImporte() {
		mov.setImporte(20);
		assertThat(20.0,equalTo(mov.getImporte()));
	}
}
