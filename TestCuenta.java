package cuentas;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCuenta extends CoreMatchers{
	
	private static Cuenta c;
	private static Movimiento m;
	
	@BeforeAll
	static void iniciar() {
		c = new Cuenta("12345","Pepe");
		m = new Movimiento();
	}
	
	@AfterAll
	static void anular() {
		c = null;
		m = null;
	}
	
	@Test
	void TestIngresar() throws IngresoNegativoException {
		c.ingresar("Juegos", 20);
		assertEquals(1,c.mMovimientos.size());;
	}

	@Test
	void TestRetirar() throws IngresoNegativoException, SaldoInsuficienteException {
		c.ingresar("nomina", 200);
		c.retirar("Netflix", 12);
		assertEquals(0,c.mMovimientos.size());
	}
	
	@Test
	void TestSaldo() throws IngresoNegativoException {
		c.ingresar("paga", 1000);
		assertEquals(1000,c.getSaldo());
	}
		
	@Test
	void TestAñadirMovimiento() {
		m.setConcepto("a");
		m.setImporte(20);
		c.addMovimiento(m);
		assertEquals(1,c.mMovimientos);
	}
	}


