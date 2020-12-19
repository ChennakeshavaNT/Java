import java.util.*;
public class program10a
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int i,j,k,n;
		System.out.println("Enter the no. of nodes:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the cost adjacency matrix:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				a[i][j]=sc.nextInt();
		}
		for(k=1;k<=n;k++)
		{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				{
					if(a[i][k]+a[k][j]<a[i][j])
						a[i][j]=a[i][k]+a[k][j];
				}
		}
	}
		System.out.println("output:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(a[i][j]+"\t");
		}
	}
}