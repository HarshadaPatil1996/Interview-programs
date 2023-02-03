package String_Manupulation;

public class reverde 
{
	public static void main(String[] args) 
	{
		
		String name="hello my name is harshada";
		
//		//reverse it 
//		int length = name.length();
//		
//		
//		for(int i=length-1;i>=0;i--)
//		{
//			System.out.print(name.charAt(i));
//			
//		}
	
		
		StringBuffer abc=new StringBuffer(name);
		
		StringBuffer a = abc.reverse();
		System.out.println(a);
	}

}
