
public class HowManyUppercase_Lowercase 
{
public static void main(String[] args) {
	// to fing out how many uppercase and lower case letters are in a string
	
	String s="WelCome To AuToMatIoN";
	
	int upper=0;
	int lower =0;
	String upper1="";
	String lower1="";
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		
		if(ch>=65 && ch<=90)
		{
			upper++;
			upper1=upper1+ch;
		}
		
		else
		{
			lower++;
			lower1=lower1+ch;
		}
		

	}
	
	System.out.println("upper case letter are: "+upper1+" num: "+upper);
	System.out.println("lower case letter are: "+lower1+" num: "+lower);
}
}
