package assignment11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
	
		codecheck s1=code.getInstance();
		codecheck s2=code.getInstance();
		
		assertTrue(codecheck.c(s1, s2));
		
	}

}
