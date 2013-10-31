package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddPolar {

	@Test
	public void test() {
		Complex a = Complex.polar(2, Math.PI/6);
		Complex b = Complex.polar(2, Math.PI/6);
		Complex c = a.add(b);
		System.out.println(c);
		assertEquals(c.toString(), "(4.0∠0.5235987755982987)");
	}

}
