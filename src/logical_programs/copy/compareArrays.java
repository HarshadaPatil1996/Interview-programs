package logical_programs.copy;

import java.util.Arrays;



public class compareArrays 
{
public static void main(String[] args)
{
int []	a= {10,20,10};

int []	b= {10,20,10};

int [] c= {1,2,3};

System.out.println("a=b :"+Arrays.equals(a, b));

System.out.println("a=c :"+Arrays.equals(a, c));

System.out.println("b=c :"+Arrays.equals(b, c));

}
}