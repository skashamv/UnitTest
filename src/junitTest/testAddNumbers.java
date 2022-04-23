package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		JunitFunction junit = new JunitFunction();
		int res = junit.AddNumber(200, 100);
		assertEquals (300,res);
	}

}
