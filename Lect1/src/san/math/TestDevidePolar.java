package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDevidePolar {

	@Test
	public void test() {
		Complex a = Complex.polar(1*Math.sqrt(2), Math.PI/4);
		Complex b = Complex.polar(2*Math.sqrt(2), Math.PI/4);
		Complex c = a.devide(b);
		System.out.println(c);
		assertEquals(c.toString(), "(0.5∠0.0)");
	
	}

}
