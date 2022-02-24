import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testValor1() {
		Circulo_IPV c = new Circulo_IPV(7, "Circulo");
		assertEquals((7*7*3.1416),c.area());
		assertEquals((7*2*3.1416),c.perimetro());
	}
	
	@Test
	void testValor2() {
		Circulo_IPV c = new Circulo_IPV(0, "Circulo");
		assertEquals((0*0*3.1416),c.area());
		assertEquals((0*2*3.1416),c.perimetro());
	}
	
	@Test
	void testValor() {
		Circulo_IPV c = new Circulo_IPV(-3, "Circulo");
		assertEquals((-3*-3*3.1416),c.area());
		assertEquals((-3*2*3.1416),c.perimetro());
	}
}
