package assignment13;

public class Code4 {
	static int result;
	//Method for addition
	public static int add(int num1, int num2){
		result = num1+num2;
		return result;
	
	}
	//Method for subtraction
	public static int substract(int num1, int num2){
		result = num1-num2;
		return result;
	}
	//Method for multiplication
	public static int multiply(int num1, int num2){
		result = num1*num2;
		return result;
	}
	//Method for division
	public static float divide(int num1, int num2){
		result = num1/num2;
		 if (num2 == 0)
	            throw new IllegalArgumentException("Cannot divide by zero!");
		System.out.println(result);
		return result;
	}
	
	public static int modulus(int num1, int num2){
		result = num1%num2;
		 if (num2 == 0)
	            throw new IllegalArgumentException("Cannot divide by zero!");
		System.out.println(result);
		
		return result;
}
	public static double power(int num1,int power){
		double result1=0;
		result1 = Math.pow(num1,power);
		if (power<0) 
			throw new IllegalArgumentException("power is always positive!");
		
		
		else 
			return result1;
		
}
	public static double squareroot(int num1){
		 double result1 = Math.sqrt(num1);
		return result1;	
}
	public static double cuberoot( int num2){
	double result2 = Math.cbrt(num2);
		return result2;
}
}
