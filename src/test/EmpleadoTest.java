package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Emp.Empleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		float expected=2000;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Vendedor, 0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected=2500;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Encargado, 0, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaootro() {
		float expected=0;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Otro, 0, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVentasnegativas() {
		float expected=0;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Otro, -1, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaEntre0y1000() {
		float expected=0;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Otro, 500, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVendedor1000y1500() {
		float expected=100;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Otro, 1400, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVendedormayor1500() {
		float expected=200;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Otro, 1600, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVendedohorasExtrasNegativas() {
		float expected=0;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Otro, 0, -1);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVendedohorasExtrasPositivas() {
		float expected=300;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEpmpleado.Otro, 0, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta0y2100() {
		float expected = 2000;
		float actual = Empleado.calculoNominaNeta(2000);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta2100y2500() {
		float expected = 1912.5f;
		float actual = Empleado.calculoNominaNeta(2250);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNeta2500ymas() {
		float expected = 2214;
		float actual = Empleado.calculoNominaNeta(2700);
		assertEquals(expected, actual);
	}


}
