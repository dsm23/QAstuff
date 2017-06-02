package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Blackjack.Operation;

public class Test2 {

	@Test
	public void test2() {
		Operation O = new Operation();
		int result = O.calc(21,18);
		assertEquals(21, result);
	}
}