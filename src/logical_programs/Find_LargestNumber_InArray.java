package logical_programs;

public class Find_LargestNumber_InArray 
{
	
	public static void main(String[] args)
	{
		int [] ar= {11,55,144,85,62,3,5411,111};
		
		int large=0;
		for(int i=0;i<=ar.length-1;i++)
		{
			
			if(large<ar[i])
			{
				large=ar[i];
				
			}
		
		}
		
		System.out.println(large);
		
	}

}
