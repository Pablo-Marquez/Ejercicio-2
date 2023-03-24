package Evaluacion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {

	@BeforeEach
	 void crearTabla() {
		Integer[] tablaVacia;
	}
	
	@Test
	void testConstructorArrayVacio(Integer[] tablaVacia) {
		
		tablaVacia=null;
		
		
		assertEquals(null, null);
	}
	@Test
	void testMayorTabla() {
		int maxEsperado=-999;
		int maxResultado=-1000;
		
		assertEquals(maxResultado, maxEsperado,"ERROR");
	}
	@Test
	void testPosicionTabla(int n) {
		
		int iResultado=-1;
		int iEsperado=0;
		
		assertEquals(iResultado, iEsperado, "ERROR");
	}
}
