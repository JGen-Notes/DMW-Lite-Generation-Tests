package dmw.test.statements.java.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dmw.test.statements.E;

class WhileStatementTest {  

	@Test
	void getSum() {
		E e = new E();
		assertEquals(10, e.getSum());
	}

}
