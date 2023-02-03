package logical_programs.copy;

import java.util.Scanner;

public class UserInputByscannerClass
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		
		String name=sc.next();
		
		
		System.out.println("enter your mobile number");
		int no=sc.nextInt();
		
		System.out.println("Registration complete");
		

	}

}
