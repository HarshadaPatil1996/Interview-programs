package logical_programs.copy;

public class Reverse_Each_Word 
{
public static void main(String[] args) 
{
	String name="hi my name is tina how are you";
	
	
	String [] ar=name.split(" ");
	
	for(int i=0; i<=ar.length-1;i++)
	{
		String org=ar[i];
		
		String rev="";
		
		for(int j=org.length()-1;j>=0;j--)
		{
			
			rev=rev+org.charAt(j);
			
		}
		
		System.out.print(rev+" ");
	}
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
