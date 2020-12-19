import java.util.*;
public class program6
{
	static int x[]=new int[50];
	static int w[]=new int [50];
	static int p[]=new int[50];
	static int t[]=new int[50];
	static int i,j,m,n;
	static double maxprofit;
	static void Dynamic(int n,int w[],int p[],int m)
	{
		int v[][]=new int[n+1][m+1];
		for(i=0;i<=n;i++)
			v[i][0]=0;
		for(j=0;j<=n;j++)
			v[0][j]=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				if(j<w[i])
					v[i][j]=v[i-1][j];
				else
					v[i][j]=max(v[i-1][j],v[i-1][j-w[i]]+p[i]);
			}
		}
		System.out.println("Optimal solution for dynamic method:"+v[n][m]);
		System.out.println("Solution table:");
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++)
				System.out.print(v[i][j]+"\t");
			System.out.println();
		}
		i=n;j=m;
		while((i!=0)&&(j!=0))
		{
			if(v[i][j]!=v[i-1][j])
			{
				x[i]=1;
				j=j-w[i];
			}
			i=i-1;
		}
		System.out.println("Solution vector:");
		for(i=1;i<=n;i++)
			System.out.print(x[i]+"\t");
	}
	static int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	static void Greedy(int n,int w[],int p[],int m)
	{
		int rc=m;
		bubblesort(n,w,p,t);
		for(i=1;i<=n;i++)
		{
			if(w[t[i]]>rc)
				continue;
			else
			{
				x[t[i]]=1;
				rc=rc-w[t[i]];
				maxprofit+=p[t[i]];
			}
		}
		System.out.println("maxprofit="+maxprofit);
		System.out.println("Solution vector:");
		for(i=1;i<=n;i++)
			System.out.print(x[i]+"\t");
		System.out.println();

	}
	static void bubblesort(int n,int w[],int p[],int t[])
	{
		int temp;
		for(i=1;i<=n;i++)
			t[i]=i;
		for(i=1;i<n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((double)p[t[j]]/w[t[j]]<(double)p[t[j+1]]/w[t[j+1]])
				{
					temp=t[j];
					t[j]=t[j+1];
					t[j+1]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the no. of items:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the items weight:");
		for(int i=1;i<=n;i++)
			w[i]=sc.nextInt();
		System.out.println("Enter the items profit:");
		for(int i=1;i<=n;i++)
			p[i]=sc.nextInt();
		System.out.println("Enter the max weight:");
		m=sc.nextInt();
		for(i=1;i<=n;i++)
			x[i]=0;
		System.out.println("Dynamic knapsack:");
		Dynamic(n,w,p,m);
		System.out.println("\nGreedy knapsack:");
		Greedy(n,w,p,m);
	}
}