package logical_programs.copy;

public class ConvertUppperCaseTOlowerCase
{
public static void main(String[] args) 
{
	
	String a="ABhjKJliiksBJKKL";
	
	int up=0;
	int low=0;
	
	for(int i=0;i<=a.length()-1;i++)
	{
		
		char org=a.charAt(i);
		
		if(org>=65 && org<=90)
		{
		     up++;               //---to get count 
			//up=up+org;            //to get characters
			
		}
		
		else
		{   low++;
			//low=low+org;
		}
		

	}
	
	System.out.println(up);
	
	System.out.println(low);
	
	
	
}
}
