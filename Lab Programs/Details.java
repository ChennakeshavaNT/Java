import java.util.*;
class Student
{
	String usn,name,branch,phone;
	Student(String usn,String name,String phone,String branch)
	{
		this.usn=usn;
		this.name=name;
		this.phone=phone;
		this.branch=branch;
	}
	void display()
	{
		System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phone);
	}
}
public class Details
{
	public static void main(String args[])
	{
		String usn,name,branch,phone;
		int i,n;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the no. of students:");
		n=sc.nextInt();
		Student s[]=new Student[n];
		System.out.println("Enter student details:");
		for(i=0;i<n;i++)
		{
			System.out.println("Name:");
			name=sc1.nextLine();
			System.out.println("USN:");
			usn=sc.next();
			System.out.println("Phone:");
			phone=sc.next();
			System.out.println("Branch:");
			branch=sc.next();
			s[i]=new Student(usn,name,phone,branch);
		}
		System.out.println("Student details are:");
		for(i=0;i<n;i++)
			s[i].display();

	}
}
