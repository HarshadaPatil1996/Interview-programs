package String_Manupulation;

import java.util.Arrays;

public class demo1 
{
	public static void main(String[] args)
	{
		
		int [] ar= {1,2,3,1,2,3,3};
		
		Arrays.sort(ar);  //permanat change
		
		for(int i=0;i<=ar.length-1;i++)//ascending 
		{
			System.out.println(ar[i]);
		}
		
		for(int i=ar.length-1;i>=0;i--)//decending
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

}
