import java.util.*;
class Mythread1 extends Thread
{
	public void run()
	{
	int i=1;
	System.out.println("Enter the no. of random numbers to be generated");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	try
	{
		while(i<=n)
		{
			Random rand=new Random();
			program3b.r=rand.nextInt(100);
			System.out.println(i+"-->Random no. generated is"+program3b.r);
			new Mythread2().start();
			new Mythread3().start();
			Thread.sleep(1000);
			System.out.println("\n\n");
			i++;
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
class Mythread2 extends Thread
{
	public void run()
	{
		System.out.println("Square of "+program3b.r+" is "+(program3b.r*program3b.r)); 
	}
}
class Mythread3 extends Thread
{
	public void run()
	{
		System.out.println("Cube of "+program3b.r+" is "+(program3b.r*program3b.r*program3b.r)); 		
	}
}
public class program3b
{
	static int r;
	public static void main(String args[])
	{
		new Mythread1().start();
	}
}