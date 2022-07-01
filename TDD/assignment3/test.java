package assignment3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		assertEquals("ankush@gmail.com", code.email("ankush@gmail.com"));
		assertEquals("ankush@123", code.password("ankush@123"));
	}
}
