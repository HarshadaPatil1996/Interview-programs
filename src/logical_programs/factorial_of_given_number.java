package logical_programs;

import java.util.Scanner;

public class factorial_of_given_number
{
public static void main(String[] args)
{
	//factorial:ex: lets say find factorial of 5
	//The meaning of 5 factorial is that we need to multiply the numbers from 1 to 5.
	//5*4*3*2*1-->120

	//using java how to find factorial of user given number
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter thr number you want factorial of:-");
	int num=sc.nextInt();
	
	int fact=1;
	
	for(int i=num;i>0;i--)
	{
		fact=fact*i;//1*5=5
		//5*4=20*3=60*0=120*1
	}
	
	System.out.println(fact);
	
}
}
