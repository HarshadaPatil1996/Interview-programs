package String_Manupulation;

public class occurance_of_sameChar_atDifferent_index
{
public static void main(String[] args) 
{
	
	String a="hi i am harshada patil";
	
	//give me all index of char a present in this string
	
	System.out.println(a.indexOf('a')); //1st occurance
	
	System.out.println(a.indexOf('a',a.indexOf('a')+1 ));  //2nd occurance
	
	System.out.println(a.indexOf('a', 10));//3rd 
	
	System.out.println(a.indexOf('a', 14));//4th
	
	System.out.println(a.indexOf('a', 16));//last 
	
	
	String ab []=a.split(" ");
	
	for(int i=0;i<=a.length()-1;i++)
	System.out.println(ab[i]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
