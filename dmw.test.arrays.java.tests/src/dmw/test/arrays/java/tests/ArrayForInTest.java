package dmw.test.arrays.java.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dmw.test.arrays.D;

class ArrayForInTest {  

	@Test
	void testSettingSubscripts() {
		D d = new D();
		assertEquals(3, d.getSum());		
	}

}
