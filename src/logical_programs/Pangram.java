package logical_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;



public class Pangram
{
public static void main(String[] args) 
{
	 String s = "The quick brown fox jumps over the lazy dog";
	    int i = 0;
	    for (char c : s.toCharArray()) 
	    {
	        int x = Character.toUpperCase(c);
	        if (x >= 'A' && x <= 'Z') 
	        {
	            i |= 1 << (x - 'A');    
	     
	        }
	    }
	    
	    if (i == (1 << (1 + 'Z' - 'A')) - 1) 
	    {  
	        System.out.println("input is a pangram");
	    } 
	    else
	    {
	        System.out.println("input is not a pangram");
	    }
	 
	
}
}