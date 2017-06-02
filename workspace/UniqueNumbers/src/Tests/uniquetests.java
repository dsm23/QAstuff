package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import UniqueNumbers.Operation;

public class uniquetests {

	@Test
	public void test() {
		Operation O = new Operation();
		int result = O.process(1, 2, 3);
		assertEquals(6, result);
	}
	@Test
	public void test2() {
		Operation O = new Operation();
		int result = O.process(1, 1, 3);
		assertEquals(3, result);
	}
	@Test
	public void test3() {
		Operation O = new Operation();
		int result = O.process(1, 1, 1);
		assertEquals(0, result);
	}
	@Test
	public void test4() {
		Operation O = new Operation();
		int result = O.process(2, 2, 2);
		assertEquals(0, result);
	}
	@Test
	public void test5() {
		Operation O = new Operation();
		int result = O.process(3,3,2);
		assertEquals(2, result);
	}
	@Test
	public void test6() {
		Operation O = new Operation();
		int result = O.process(5,6,6);
		assertEquals(5, result);
	}
	@Test
	public void test7() {
		Operation O = new Operation();
		int result = O.process(3,6,7);
		assertEquals(16, result);
	}
}