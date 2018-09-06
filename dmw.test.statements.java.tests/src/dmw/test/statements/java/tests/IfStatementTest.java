package dmw.test.statements.java.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dmw.test.statements.A;

class IfStatementTest {  

	@Test
	void testIfGreaterThen() {
		A a = new A();
		assertEquals("else", a.getGreaterThen10(1));
		assertEquals("then", a.getGreaterThen10(11));
	}
	
	@Test
	void testIfGreaterEqualThen() {
		A a = new A();
		assertEquals("else", a.getGreaterEqualThen10(1));
		assertEquals("then", a.getGreaterEqualThen10(11));
		assertEquals("then", a.getGreaterEqualThen10(10));
	}
	
	@Test
	void testIfEqual() {
		A a = new A();
		assertEquals("else", a.getEqual10(1));
		assertEquals("then", a.getEqual10(10));
	}
	
	@Test
	void testIfLessThen() {
		A a = new A();
		assertEquals("else", a.getLessThen10(11));
		assertEquals("then", a.getLessThen10(1));
	}

	@Test
	void testIfLessEqualThen() {
		A a = new A();
		assertEquals("else", a.getLessEqualThen10(11));
		assertEquals("then", a.getLessEqualThen10(1));
		assertEquals("then", a.getLessEqualThen10(10));
	}
	
	@Test
	void testTrue() {
		A a = new A();
		assertEquals("then", a.getTrue());
	}
	
	@Test
	void testFalse() {
		A a = new A();
		assertEquals("else", a.getFalse());
	}
	
	@Test
	void testAnd() {
		A a = new A();
		assertEquals("then", a.getAnd());
	}
	
	
	@Test
	void testAndFalse() {
		A a = new A();
		assertEquals("else", a.getAndFalse());
	}
	
	@Test
	void testOr() {
		A a = new A();
		assertEquals("then", a.getOr());
	}	
	
	@Test
	void testOrFalse() {
		A a = new A();
		assertEquals("else", a.getOrFalse());
	}
}
