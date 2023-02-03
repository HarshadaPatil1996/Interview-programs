package logical_programs.copy;

public class reverse_string 
{
public static void main(String[] args)
{
	String A="hello this is new class";
	
	String rev="";
	
	int a = A.length()-1;
			
	for(int i=a;i>=0;i--)		
	{
		rev=rev+A.charAt(i);
	
	}
	
	
	//OR
	
	System.out.println(rev);
	
	StringBuffer bf=new StringBuffer(A);
	
	System.out.println(bf.reverse());
	
	
	
	
	
	
	
	
	
	
	
	
}
}
