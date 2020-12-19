import java.util.*;
public class program12
{
	static int x[]=new int[50];
	static void nextvertex(int g[][],int n,int k)
	{
		int j;
		while(true)
		{
			x[k]=(x[k]+1)%(n+1);
		if(x[k]==0)
			return;
		if(g[x[k-1]][x[k]]!=0)
		{
			for(j=1;j<=k-1;j++)
			{
				if(x[j]==x[k])
					break;
			}
			if(j==k)
			{
				if((k<n)||(k==n)&&(g[x[n]][x[1]]!=0))
					return;
			}
		}
	}
	}
	static void hcycle(int g[][],int n,int k)
	{
		int i;
		while(true)
		{
			nextvertex(g,n,k);
			if(x[k]==0)
				return;
			if(k==n)
			{
				System.out.println("\n");
				for(i=1;i<=n;i++)
					System.out.print(x[i]+"-->");
				System.out.println(x[1]);
			}
			else
				hcycle(g,n,k+1);
		}
	}
	public static void main(String args[])
	{
		int i,j;
		int g[][]=new int[10][10];
		System.out.println("Enter the no. of nodes:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the path adjacency matrix:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				g[i][j]=sc.nextInt();
				x[i]=0;
		}
		x[1]=1;
		hcycle(g,n,2);
}
}