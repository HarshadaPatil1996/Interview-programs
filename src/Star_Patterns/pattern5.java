package Star_Patterns;

public class pattern5
{
//*
//***
//*****                 -->incremented by 2
//*******
	
	public static void main(String[] args) {
		int star=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star=star+2;
		}

	}

}
