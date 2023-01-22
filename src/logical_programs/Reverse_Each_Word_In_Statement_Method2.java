package logical_programs;

public class Reverse_Each_Word_In_Statement_Method2
{
	public static void main(String[] args) 
	{
		String s1="my name is abc";    //ym eman  si cba
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		//                   2<=3 
		for(int i=0; i<=ar.length-1; i++)      //
		{				           // 2
			String org = ar[i];  //  is
			String rev = reverseString(org);
		
			System.out.print(rev+" ");   //ym eman si cba
		}
	}
	
	public static String reverseString(String inp) 
	{
		String rev="";
		for(int i=inp.length()-1; i>=0; i--)
		{
			rev=rev+inp.charAt(i);
		}
		return rev;
	}
	

}
