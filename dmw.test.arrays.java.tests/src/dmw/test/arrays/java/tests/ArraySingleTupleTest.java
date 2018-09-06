package dmw.test.arrays.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dmw.test.arrays.A;

class ArraySingleTupleTest {  

	@Test
	void testSettingSubscripts() {
		A a = new A();
		assertEquals(1, a.getOneNumber());
		assertEquals(2, a.getTwoNumber());
		assertEquals("one", a.getOneText());
		assertEquals("two", a.getTwoText());
	}

}
