package logical_programs;

public class Minus_One_from_eachEvenIndex_OfArray 
{
public static void main(String[] args) 
{
	int [] ar= {1,2,3,4,5};
	int ar1=0;
	for(int i=0;i<=ar.length-1;i++)
	{
		if(i%2==0 && i!=0)
		{
			ar1=ar[i]-1;
			ar[i]=ar1;
		}
		
	}
	for(int b:ar)
	{
		System.out.println(b);
	}
}
}
