package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JunitTestTest {

	@Test
	void test() {

		JunitTest test = new JunitTest();

		int actual = test.add(1, 20);
		assertEquals(30, actual);
	}

}
