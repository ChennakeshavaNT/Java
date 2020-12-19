import java.util.*;

class Shape{

	Scanner read=new Scanner(System.in);
	void compute(int n)
	{
		for(int i=1;i<n;i++){
		 if(n==0){
		 	System.out.print("Invalid Input"); 
		 	System.out.print("Enter the Number again:");
		 	n=read.nextInt();
		 	compute(n);
		 }
		 else if(n%2==0)
		 	even();
		 else
		 	odd();
		}
	}
	void odd()
	{
		System.out.print("***************");
		System.out.print("**     *     **");
		System.out.print("* *    *    * *");
		System.out.print("*  *   *   *  *");
		System.out.print("*   *  *  *   *");
		System.out.print("*    * * *    *");
		System.out.print("*     ***     *");
		System.out.print("***************");
		System.out.print("*     ***     *");
		System.out.print("*    * * *    *");
		System.out.print("*   *  *  *   *");
		System.out.print("*  *   *   *  *");
		System.out.print("* *    *    * *");
		System.out.print("**     *     **");
		System.out.print("***************");
	}

	void even()
	{
		System.out.print("***************");
		System.out.print("**     *     **");
		System.out.print("* *    *    * *");
		System.out.print("*  *   *   *  *");
		System.out.print("*   *  *  *   *");
		System.out.print("*    * * *    *");
		System.out.print("*     ***     *");
		System.out.print("***************");
		System.out.print("***************");
		System.out.print("*     ***     *");
		System.out.print("*    * * *    *");
		System.out.print("*   *  *  *   *");
		System.out.print("*  *   *   *  *");
		System.out.print("* *    *    * *");
		System.out.print("**     *     **");
		System.out.print("***************");
	}
}
public class pattern {
    public static void main ( String[] args )
    {

		 int n=Integer.parseInt(args[1]);
		 Shape s=new Shape();
		 Scanner sn =new Scanner(System.in);
		 s.compute(n);
		 System.out.print("..........End of program.........");

    }
}
