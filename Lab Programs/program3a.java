import java.util.*;
public class program3a
{
	public static void main(String args[])
	{
		int a,b;
		float res;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			if(b==0)
				throw new ArithmeticException("Divide by zero Error");
			res=(float)a/b;
			System.out.println("Result="+res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}