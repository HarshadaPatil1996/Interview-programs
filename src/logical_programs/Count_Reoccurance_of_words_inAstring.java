package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class Count_Reoccurance_of_words_inAstring 
{
	public static void main(String[] args) 
	{
		
		String name="hi hi hello hello java java programms";
		
		HashMap<String, Integer> mp=new HashMap<>();
		
		String [] value=name.split(" ");
		
		for(int i=0;i<=value.length-1;i++)
		{
			
			
			if(mp.containsKey(value[i]))
			{
				
				mp.put(value[i], mp.get(value[i])+1);
				
			}
			
			else
			{
				mp.put(value[i], 1);
			}
			
			
		}
		
		System.out.println("-----Occurance of word------");
		Set<String> all = mp.keySet();
		
		for(String al:all)
		
		{
			System.out.println(al+": "+mp.get(al));
			
		}
	
	}

}
