package dmw.test.arrays.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dmw.test.arrays.B;

class ArrayMultiTupleTest {  

	@Test
	void testSettingSubscripts() {
		B b = new B();
		assertEquals(1, b.getOneNumber());
		assertEquals(2, b.getTwoNumber());
		assertEquals("one", b.getOneText());
		assertEquals("two", b.getTwoText());
	}

}
