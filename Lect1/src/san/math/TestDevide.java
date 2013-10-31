package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDevide {

	@Test
	public void test() {
		Complex a = Complex.carthesian(4, 2);
		Complex b = Complex.carthesian(3, -1);
		Complex c = a.devide(b);
		System.out.println(c);
		assertEquals(c.toString(), "(1.0+1.0j)");
			}
}
