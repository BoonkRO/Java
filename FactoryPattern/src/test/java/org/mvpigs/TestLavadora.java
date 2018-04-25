package org.mvpigs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		FactoryLavadora factory = new LavadoraCargaFrontalFactory();
		assertNotNull(factory);

		Lavadora lavadora = factory.crearLavadora();
		assertNotNull(lavadora);
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {

        FactoryLavadora factory = new LavadoraCargaSuperiorFactory();
        assertNotNull(factory);

        Lavadora lavadora = factory.crearLavadora();
        assertNotNull(lavadora);
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
