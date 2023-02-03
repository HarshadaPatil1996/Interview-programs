package String_Manupulation;

public class a 
{
	public static void main(String[] args) {
		
		String name="harshada111";
		
		String rev="";
		int b=name.length()-1;
		
		for(int a=b;a>=0;a--)
		{
			rev=rev+name.charAt(a);
			
		}
		//System.out.println(rev);
		
	
		
		StringBuffer run=new StringBuffer(name);
		
		System.out.println(run.reverse());
		
	}

}
