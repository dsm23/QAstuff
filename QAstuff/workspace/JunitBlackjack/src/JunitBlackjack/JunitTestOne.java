package JunitBlackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestOne {
	
	@Test
	public void test() {
		JunitBlackjack J = new JunitBlackjack();
		for (int i = 0; i < 17; i++){			
			int result = J.calc(i, 18);
			assertEquals(18, result);
		}
	}

}
