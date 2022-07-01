package assignment13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void add() {
		assertEquals(105, Code4.add(15,90));
	}
	@Test
	void sub() {
		assertEquals(-10, Code4.substract(100,110));
	}
	@Test
	void mul() {
		assertEquals(1500, Code4.multiply(15,100));
	}

	@Test
	void mod() {
		assertEquals(5, Code4.modulus(15,10));
	}
	@Test
	void pow() {
		assertEquals(25, Code4.power(5,2));
		  
		
		 try {
			 assertEquals(25, Code4.power(5,-1));
				  
				  
				  } catch (IllegalArgumentException e) {
					  System.out.println("This line will not be Executed");
				   System.out.println("In the catch Block due to Exception = " + e);
				  
				  }
	}
	@Test
	void sqrt() {
		assertEquals(5, Code4.squareroot(25));
	}
	@Test
	void cube() {
		assertEquals(2, Code4.cuberoot(8));
	}
	@Test
    void testExceptionIsThrown() {
        Code4 tester = new Code4();
        
      
        assertEquals(2,Code4.divide(4, 2));
	
	 try {
		assertEquals(2,Code4.divide(1000,0));
		  
		  
		  } catch (ArithmeticException e) {
			  System.out.println("This line will not be Executed");
		   System.out.println("In the catch Block due to Exception = " + e);
		  
		  }
	}
	@Test
    void testExceptionIsThrown2() {
        Code4 tester = new Code4();
        
      
        assertEquals(0,Code4.modulus(4, 2));
	
	 try {
		assertEquals(2,Code4.modulus(1000,0));
		  
		  
		  } catch (ArithmeticException e) {
			  System.out.println("This line will not be Executed");
		   System.out.println("In the catch Block due to Exception = " + e);
		  
		  }
	}
	
}
