package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplay {

	@Test
	public void test() {
		Complex a = Complex.carthesian(1, 1);
		Complex b = Complex.carthesian(2, 2);
		Complex c = a.multiply(b);
		System.out.println(c);
		assertEquals(c.toString(), "(4.0j)");
		}

}
