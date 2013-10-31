package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConjugatePolar {

	@Test
	public void test() {
		Complex a = Complex.polar(5,Math.PI/4);
		Complex b = a.conjugate();
		System.out.println(b);
		assertEquals(b.toString(), "(5.0∠-0.7853981633974483)");
	}

}
