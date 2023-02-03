package logical_programs.copy;

public class Palindrome
{
public static void main(String[] args) 
{
	
	String name="harah";
	
	String rev="";
	
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	
	if(name.equals(rev))
	{
		System.out.println("Given word is a palindrome");
	}
	else
	{
		System.out.println("Given word is not pallinedrome");
	}
	
	
	
	
	
}
}
