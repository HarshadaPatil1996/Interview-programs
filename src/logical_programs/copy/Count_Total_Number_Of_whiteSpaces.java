package logical_programs.copy;

public class Count_Total_Number_Of_whiteSpaces 
{
public static void main(String[] args)

{
	
	String name="Hello there how are you doing";
	
	int count=0;
	
	for(int i=0;i<=name.length()-1;i++)
	{
	     char a=name.charAt(i);
	     
	     if(a==' ')
	     {
	    	 count++;
	     }
		
		
	}
	
	System.out.println(count);
	
}
	
}
