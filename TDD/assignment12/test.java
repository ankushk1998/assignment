package assignment12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {


		 @Test
		    void test1() throws CloneNotSupportedException {
		        Code14 s1 = new Code14 (101,"Ankush");
		        Code14 s2 = (Code14)s1.clone();


		        assertEquals(true,Code14.checkClone(s1, s2));

		    }

		
	}


