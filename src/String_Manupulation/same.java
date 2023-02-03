package String_Manupulation;

public class same {

	public static void main(String[] args)
	{
		String a="harshada tina";
		
		System.out.println(a.indexOf('a'));  //ist ocurance
		
		
		System.out.println(a.indexOf('a', a.indexOf('a')+1));

		
		
		System.out.println(a.lastIndexOf('a', a.lastIndexOf('a')-1));
		
		System.out.println(a.lastIndexOf('a'));
	}

}
