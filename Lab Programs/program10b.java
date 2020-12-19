import java.util.*;
public class program10b
{
	static int n,mincost=0;
	static int visited[]=new int[50];
	static int cost[][]=new int[50][50];
	static int tspdynamic(int i,int copy[])
	{
		int s[]=new int[20];
		int j,val,min=999;
		boolean flag=false;
		for(j=1;j<=n;j++)
			s[j]=copy[j];
		s[i]=1;
		if(n==1)
			return cost[i][1];
		for(j=1;j<=n;j++)
			{
				if(s[j]==0)
				{
					flag=true;
					val=cost[i][j]+tspdynamic(j,s);
					if(val<min)
						min=val;
				}
			}
			if(!flag)
			{
				min=cost[i][1];
			}
		return min;
	}
	public static void main(String args[])
	{
		int i,j;
		System.out.println("Enter the no. of nodes:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the cost adjacency matrix:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				cost[i][j]=sc.nextInt();
		}
		mincost=tspdynamic(1,visited);
		System.out.println("Tour cost="+mincost);
}
}