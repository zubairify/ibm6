import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertFunctions {

	@Test
	public void testAsserts() {
		String s1 = "Junit";
		String s2 = "Junit";
		String s3 = "unit";
		String s4 = null;
		
//		assertEquals(s1, s2);
//		assertSame(s1, s2);
//		assertNotSame(s1, s3);
//		assertNull(s4);
		assertNotNull(s1);
		
		int n1 = 10;
		int n2 = 20;
		assertTrue(n1 > n2);
	}
}
