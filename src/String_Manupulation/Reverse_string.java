package String_Manupulation;

public class Reverse_string 

//string is immutable in nature so we can;t use (variable.rev) function to reverse a stirng 
{
public static void main(String[] args) 
{
	
	String a="harshada";  //reverse the string object
	//1st approach:
	
	int length=a.length();
	//using length() function we can find size of string 
	     //and then length -1 will give use the last index of string character
	          //and then using charAt() function we can find char present at given index
	               //use these function in for loop to reverse string 
	
    for(int i=length-1;i>=0;i--)
   {
	 System.out.print(a.charAt(i));
	 
    }
	System.out.println();
	
	
	//2nd approch:
	
    //we have stringBuffer class present in java(in-bulit class present in java) 
    //which is mutable in nature and has reverse function
    String b="software";
    
    StringBuffer file=new StringBuffer(b);
    
    System.out.print(file.reverse());

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
