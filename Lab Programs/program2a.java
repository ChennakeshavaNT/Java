import java.util.*;
class Staff
{
	String sid,name,phone;
	double sal;
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter sid,name,phone number,salary:");
		sid=sc.next();
		name=sc1.nextLine();
		phone=sc.next();
		sal=sc.nextDouble();
	}
	void display()
	{
		System.out.println("SID:"+sid);
		System.out.println("Name:"+name);
		System.out.println("Phone:"+phone);
		System.out.println("Salary:"+sal);
	}
}
class Teaching extends Staff
{
	String domain;
	int pub;
	void read()
	{
		super.read();
		 System.out.println("Enter domain and publications:");
		 domain=sc1.nextLine();
		 pub=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Domain:"+domain+"\nPublications:"+pub);
	}
}
class Technical extends Staff
{
	String skill;
	void read()
	{
		super.read();
		System.out.println("Enter Skill:");
		skill=sc1.nextLine();
	}
	void display()
	{
		super.display();
		System.out.println("Skill:"+skill);
	}
}
class Contract extends Staff
{
	int period;
	void read()
	{
		super.read();
		System.out.println("Enter period:");
		period=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Period:"+period);
	}
}
class program2a
{
	public static void main(String args[])
	{
		Teaching t=new Teaching();
		Technical te=new Technical();
		Contract c=new Contract();
		System.out.println("Enter Teaching staff details:");
		t.read();
		System.out.println("Enter Technical Staff details:");
		te.read();
		System.out.println("Enter Contract staff details:");
		c.read();
		System.out.println("Teaching Staff Details:");
		t.display();
		System.out.println("Technical staff details:");
		te.display();
		System.out.println("Contract staff details:");
		c.display();
	}
}