import java.util.*;
public class program8
{
	static int cost[][]=new int[50][50];
	static int parent[]=new int[50];
	static int n,a,b,i,j,u,v,min,mincost=0,noe=1;
	static int find(int w)
	{
		while(parent[w]!=0)
			w=parent[w];
		return w;
	}
	static void union()
	{
		if(u!=v)
		{
			System.out.println(noe+" Edge=("+a+","+b+")="+min);
			noe++;
			mincost+=min;
			parent[v]=u;
		}
		cost[a][b]=cost[b][a]=9999;
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
		while(noe<=n)
		{
			 min=9999;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(cost[i][j]<min)
					{
						min=cost[i][j];
						a=u=i;
						b=v=j;
					}
				}
			}
			u=find(u);
			v=find(v);
			union();
		}
		System.out.println("Mincost="+mincost);
	}
}