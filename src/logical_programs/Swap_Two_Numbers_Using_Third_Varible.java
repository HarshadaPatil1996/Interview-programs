package logical_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Swap_Two_Numbers_Using_Third_Varible
{
public static void main(String[] args) 
{
	int x=10,y=20;
	int t=0;
	
	System.out.println("Before swapping");
	System.out.println("x: " +x);
	System.out.println("y: " +y);
	
	t=x;
	x=y;
	y=t;
	
	System.out.println("After swapping");
	System.out.println("x: " +x);
	System.out.println("y: " +y);
	
}
}
