package dmw.test.statements.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dmw.test.statements.B;

class SwitchStatementTest {  

	@Test
	void testGetReturnOnInt() {
		B b = new B();
		assertEquals("case 1", b.getReturnOnInt(1));
		assertEquals("case 2", b.getReturnOnInt(2));
		assertEquals("default", b.getReturnOnInt(3));
	}
	
	@Test
	void testGetReturnOnString() {
		B b = new B();
		assertEquals("case 1", b.getReturnOnString("one"));
		assertEquals("case 2", b.getReturnOnString("two"));
		assertEquals("default", b.getReturnOnString("three"));
	}

}
