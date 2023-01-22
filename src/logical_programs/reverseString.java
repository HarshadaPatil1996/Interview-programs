package logical_programs;

public class reverseString
{
//two ways 1-->using lenght() and charAt() methods
	public static void main(String[] args)
	{
		
	
	String name="harshada";
	
	String rev="";
	
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	
	
	System.out.println(rev);
	
	//2--> using stringBuffer class
	String a="velocity";
	StringBuffer b=new StringBuffer(a);
	
	System.out.println(b.reverse());
	
	}
}
