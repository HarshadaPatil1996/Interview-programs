package Star_Patterns;

public class pattern12
{
	public static void main(String[] args) 
	{
  		 // *******
		 //  *****
		 //   ***
		 //    *
		
		int space=0;
		int star=7;
		for(int i=1; i<=4; i++)         //outer for loop --> rows
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;		
		}
	
	}
}
