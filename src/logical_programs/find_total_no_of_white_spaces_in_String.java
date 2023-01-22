package logical_programs;

public class find_total_no_of_white_spaces_in_String 
{
	public static void main(String[] args) {
		
		String str = " a b   c d";
		int count = 0;        //1

		//                 //2<=
		for (int i = 0; i <= str.length() - 1; i++)
		{    //                               2
			char s1 = str.charAt(i);   //b
			// 
			if (s1 == ' ')    //b==' '
			{
				count++;     //1
			}
		}

		System.out.println("no of spaces in given string: " + count);

	}

}
