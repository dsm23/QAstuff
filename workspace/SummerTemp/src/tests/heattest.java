package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import stuff.Operation;

public class heattest {

	@Test
	public void test() {
		Operation O = new Operation();
		boolean result = O.process(100,true);
		assertEquals(true,result);
	}
	@Test
	public void test2() {
		Operation O = new Operation();
		boolean result = O.process(100,false);
		assertEquals(false,result);
	}
	@Test
	public void test3() {
		Operation O = new Operation();
		boolean result = O.process(101,true);
		assertEquals(false,result);
	}
	@Test
	public void test4() {
		Operation O = new Operation();
		boolean result = O.process(91,false);
		assertEquals(false,result);
	}
	@Test
	public void test5() {
		Operation O = new Operation();
		boolean result = O.process(60,false);
		assertEquals(true,result);
	}
	@Test
	public void test6() {
		Operation O = new Operation();
		boolean result = O.process(59,false);
		assertEquals(false,result);
	}
	@Test
	public void test7() {
		Operation O = new Operation();
		boolean result = O.process(60,true);
		assertEquals(true,result);
	}
	@Test
	public void test8() {
		Operation O = new Operation();
		boolean result = O.process(59,true);
		assertEquals(false,result);
	}

}
