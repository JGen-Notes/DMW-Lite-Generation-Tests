package dmw.test.statements.java.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dmw.test.statements.F;

class ForInStatementTest {  

	@Test
	void getSum() {
		F e = new F();
		assertEquals(3, e.populate());
		assertEquals(3, e.getSum());
	}

}
