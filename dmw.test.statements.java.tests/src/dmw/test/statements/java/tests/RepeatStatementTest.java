package dmw.test.statements.java.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import dmw.test.statements.G;

class RepeatStatementTest {  

	@Test
	void testGetSum() {
		G g = new G();
		assertEquals(10, g.getSum());		
	}

}
