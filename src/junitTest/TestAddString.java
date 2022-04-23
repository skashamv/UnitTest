package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddString {

	@Test
	void test() {
		JunitFunction junit = new JunitFunction();
		String res = junit.AddString("Saksham", " Verma");
		assertEquals ("Saksham Verma",res);
	}

}
