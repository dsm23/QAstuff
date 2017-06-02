package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Blackjack.Operation;

public class TeststuffTest {

	@Test
	public void test() {
		Operation O = new Operation();
		int result = O.calc(18,20);
		assertEquals(20, result);
	}
	@Test
	public void test2() {
		Operation O = new Operation();
		int result = O.calc(21,18);
		assertEquals(21, result);
	}
	@Test
	public void test3() {
		Operation O = new Operation();
		int result = O.calc(22,20);
		assertEquals(20, result);
	}
	@Test
	public void test4() {
		Operation O = new Operation();
		int result = O.calc(22,22);
		assertEquals(0, result);
	}
}