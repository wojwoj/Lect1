package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubstruct {

	@Test
	public void test() {
		Complex a = Complex.carthesian(1, 1);
		Complex b = Complex.carthesian(2, 2);
		Complex c = a.substract(b);
		System.out.println(c);
		assertEquals(c.toString(), "(-1.0-1.0j)");
		}

}
