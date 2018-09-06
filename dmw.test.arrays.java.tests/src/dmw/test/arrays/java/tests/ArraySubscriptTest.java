package dmw.test.arrays.java.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dmw.test.arrays.C;

class ArraySubscriptTest {  

	@Test
	void testSettingSubscripts() {
		C c = new C();
		assertEquals(0, c.getZero());
		assertEquals(99, c.getMax());
		assertEquals(15, c.setSubscript(15));
		assertEquals(15, c.getLast());
	}

}
