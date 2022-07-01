package assignment10;

public class Code10 {
public static String sconcat(String a[]) {
	String b="";
	for (int i=0 ;i<a.length;i++) {
		if(i==a.length-1)
			b+=a[i];
		else
			b+=a[i]+"-";
		
		
		
	}
	return b;
	
}
}
