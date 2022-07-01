package assignment9;

public class Code9 {
public static String check(String a) {
	String b=a.replaceAll("[@$-.]","");
	System.out.println(b);
	return b;
}
}
