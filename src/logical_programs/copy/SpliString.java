package logical_programs.copy;

public class SpliString 
{
	public static void main(String[] args) {
		
		String name="123-123-659-856-965-6655-555";
		
		
		String [] ar=name.split("-");
		
		for (int i=0;i<=6;i++)
		{
			
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
	}

}
