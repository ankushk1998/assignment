package asssignment8;

public class Code5 {
	
public static int even(int a[]) {
	
	int count=0;   
	System.out.print("Even numbers:");
    for(int i = 0 ; i < 9; i++)
    {
        if(a[i] % 2 == 0)
        {
            System.out.print(a[i]+" ");
            count++;
        }

}
	return count ;
}
}