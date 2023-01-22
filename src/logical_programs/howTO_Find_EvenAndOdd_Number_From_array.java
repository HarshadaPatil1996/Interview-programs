package logical_programs;

public class howTO_Find_EvenAndOdd_Number_From_array 
{
public static void main(String[] args) 
{
	int [] a= {0,1,2,3,4,5,6};
	
	for(int i=0;i<=a.length-1;i++)
	{
    	if(i%2==0)
	 {
		System.out.println("even:"+a[i]);
	 }
	
    else	
	 {
		System.out.println("odd :"+a[i]);
	 }
	
    
	}
	System.out.println();
}
}
