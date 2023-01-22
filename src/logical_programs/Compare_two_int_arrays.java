package logical_programs;

import java.util.Arrays;

public class Compare_two_int_arrays 
{
public static void main(String[] args)
{
	//compare if given two int arrays are same or not
	
	
	int [] ar= {10,20,30,40};
	
	int [] ar1= {10,20,30,40};
	
	
	int [] ar2= {10,80,70,90};
	
	//arrays class contains various methods for manupulating arrays 
	//using equals mehtod present in arrays class we can compare two int arrays
	
	System.out.println(Arrays.equals(ar1, ar2));
	
	
	System.out.println(Arrays.equals(ar1, ar));
	
	
}
}
