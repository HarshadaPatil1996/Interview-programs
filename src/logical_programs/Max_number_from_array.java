package logical_programs;

public class Max_number_from_array 
{
public static void main(String[] args) 
{
    int [] ar= {1,221,2588,4156,85,41,62,2};
	
	int max=ar[0];   //assume number at zero index is a max num
	
	for(int i=0;i<=ar.length-1;i++)   //start the loopform 0to last index
	{
		
		if(max<ar[i])      //id max is less than any num it will update cureent max value
		{
			max=ar[i];
		}
		
	}
	
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
