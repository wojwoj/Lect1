package san.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConjugate {

	@Test
	public void test() {
		Complex a = Complex.carthesian(5, 1);
		Complex b = a.conjugate();
		System.out.println(b);
		assertEquals(b.toString(), "(5.0-1.0j)");
	
	}

}
