package assignment1;

public class code1 {
	public static int hcf(int a ,int b) {
		int hcf1=0;
		for (int i=1;i<=a ||i<=b;i++) {
			if (a%i==0 && b%i==0)
			hcf1=i;
			
		}
		System.out.println(hcf1);
		return hcf1;
	}

}
