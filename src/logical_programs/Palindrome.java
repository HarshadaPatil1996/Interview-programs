package logical_programs;

public class Palindrome 
{//how to find is given string is pallindrome i.e word remains same even after reversing
//ex: madam--->madam

	
	public static void main(String[] args) 
	{
		//step1: we need to reverse the string first
		
		String name="madam";
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)//start from last index till the 1st
		{
			
			rev=rev+name.charAt(i);//m           --->at last index
			                       //m+a
			                       //ma+d
			                       //mad+a
			                       //mada+m then loop will break
		}
		
		System.out.println(rev);
		
		//step 2: then compare two strings i.e original and reversed string using equals method 
		
		if(name.equals(rev))
		{
			System.out.println("given word "+name+" is pallindrome");
		}
		
		else
		{
			System.out.println("given word "+name+" is NOT pallindrome");
		}
		
	}

}
