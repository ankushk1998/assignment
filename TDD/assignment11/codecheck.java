package assignment11;

import java.util.HashMap;
import java.util.Map;

 class code {
public static codecheck A=new codecheck();

private code(){
}
public static codecheck getInstance () {
	
	return A;
}
}


public class codecheck
{
	public static boolean c(codecheck st1,codecheck st2) {
		if (st1.hashCode()==st2.hashCode()) {
		return true;	
		}else 
			return false;
	}

	public static codecheck getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}


