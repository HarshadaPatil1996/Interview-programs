package logical_programs.copy;

public class ReverseNumber 
{
	public static void main(String[] args) 
{
	int num=123456789;
	
	String numS=Integer.toString(num);  //Integer.toString()-->converts int to string
	String rev="";
	
	for(int i=numS.length()-1;i>=0;i--)
	{
		rev=rev+numS.charAt(i);
	}
	
	int RevNum=Integer.parseInt(rev);//Integer.parsInt()-->converts string to int 
	
	System.out.println(RevNum);
	
	
}

}
