package logical_programs;

public class Armstrong_number 
{//Armstrong_number: is a number that is equal to the sum of cubes of its digits.
//ex: 153= (1*1*1 )+( 5*5*5) +( 3*3*3)=153 
//For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
	
// find out if given number is armstrong number or not
public static void main(String[] args) {
	

	int OriginalNum=153;
	
	int sum=0;
	
	for(int i= OriginalNum;i>0;i=i/10) //153/10=15.3 so any num after pont will get removed (int-->float)
	{
		
		int remaindar=i%10; //153/10=3
		sum=sum+(remaindar*remaindar*remaindar);
		
	}
	
	System.out.println(sum);
	
	
	
	if(OriginalNum==sum)
	{
		System.out.println("Given number is an armstrong Number");
	}
	
	else
	{
		System.out.println("Given number is NOT an armstrong Number");
	}
	
	
	
	
	
	
	
}
}