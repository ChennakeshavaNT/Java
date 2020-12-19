import java.util.*;
class Customer
{
	String data,name,dob;
	void read()
	{
		System.out.println("Enter the details in the format <name,dd/mm/yyyy>");
		Scanner sc=new Scanner(System.in);
		data=sc.nextLine();
	}
	void display()
	{
		String s[]=data.split(",");
		name=s[0];
		dob=s[1];
		StringTokenizer str=new StringTokenizer(dob,"/");
		System.out.println(name+","+str.nextToken()+","+str.nextToken()+","+str.nextToken());
	}
}
public class program2b
{
	public static void main(String args[])
	{
		Customer obj=new Customer();
		obj.read();
		obj.display();
	}
}