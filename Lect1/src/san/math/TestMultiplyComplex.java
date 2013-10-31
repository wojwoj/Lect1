package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplyComplex {

	@Test
	public void test() {
		Complex a = Complex.polar(1*Math.sqrt(2), Math.PI/4);
		Complex b = Complex.polar(2*Math.sqrt(2), Math.PI/4);
		Complex c = a.multiply(b);
		System.out.println(c);
		assertEquals(c.toString(), "(4.000000000000001∠1.5707963267948963)");
	}

}
