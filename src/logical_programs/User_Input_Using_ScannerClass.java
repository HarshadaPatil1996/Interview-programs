package logical_programs;

import java.util.Scanner;

public class User_Input_Using_ScannerClass
{
	public static void main(String[] args)
	{
		
		Scanner info=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=info.next();
		
		System.out.println("enter your last name");
		String last=info.next();
		
		System.out.println("ENter your roll no");
		int a=info.nextInt();
		
		System.out.println(name+" "+last+" "+a);
		
		
		
		
		
		
		
		
	}
}
