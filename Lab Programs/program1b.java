import java.util.*;
class Stack
{
	int a[];
	int size,i,top=-1;
	Stack(int size)
	{
		this.size=size;
		a=new int[size];
	}
	void push()
	{
		if(top==size-1)
			System.out.println("Stack overflow");
		else
		{
			System.out.println("Enter the element:");
			Scanner sc=new Scanner(System.in);
			int ele=sc.nextInt();
			a[++top]=ele;
		}
	}
	void pop()
	{
		if(top==-1)
			System.out.println("Stack Underflow");
		else
		{
			System.out.println("Popped element is:"+a[top--]);
		}
	}
	void display()
	{
		if(top==-1)
			System.out.println("Stack Empty");
		else
		{
			System.out.println("Stack contains:");
			for(i=top;i>=0;i--)
				System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
}
public class program1b
{
	public static void main(String args[])
	{
		int ch,n,i;
		 System.out.println("Enter the size of the stack:");
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 Stack obj=new Stack(n);
		 for(;;)
		 {
		 	System.out.println("MENU:\n1:Push\n2:Pop\n3:Display\n4:Exit\nEnter your choice:");
		 	ch=sc.nextInt();
		 	switch(ch)
		 	{
		 		case 1:obj.push();
		 				break;
		 		case 2:obj.pop();
		 				break;
		 		case 3:obj.display();
		 				break;
		 		default:System.exit(0);
		 	}
		 }
	}
}