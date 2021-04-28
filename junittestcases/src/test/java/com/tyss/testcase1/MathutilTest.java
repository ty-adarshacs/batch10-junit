package com.tyss.testcase1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathutilTest {

	@Test
	void testAddnumber() {
		Mathutil m=new Mathutil();
		int exp=10;
		int actual=m.addnumber(5, 5);
		assertEquals(exp, actual, "not correct try next time");
	}
	@Test
	void testdivide() {
		Mathutil m=new Mathutil();
		assertThrows(ArithmeticException.class,()->m.divide(10, 0));
	}

}
