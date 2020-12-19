import java.util.*;
public class program7
{
	static void shortest(int v,int cost[][],int dist[],int n)
	{
		boolean s[]=new boolean[10];
		int i,w,u,num;
		for(i=1;i<=n;i++)
		{
				s[i]=false;
				dist[i]=cost[v][i];
		}
		s[v]=true;
		dist[v]=0;
		num=2;
		while(num<=n)
		{
			u=choose(s,dist,n);
			s[u]=true;
			num++;
			for(w=1;w<=n;w++)
			{
				if(dist[u]+cost[u][w]<dist[w] && !s[w])
					dist[w]=dist[u]+cost[u][w];
			}
		}		
	}
	static int choose(boolean s[],int dist[],int n)
	{
		int w,j=0,min=999;
		for(w=1;w<=n;w++)
		{
			if(dist[w]<min && s[w]==false)
			{
				min=dist[w];
				j=w;
			}

		}
		return j;
	}
	public static void main(String args[])
	{
		int cost[][]=new int[50][50];
		int n,i,j,v;
		int dist[]=new int[50];
		System.out.println("Enter the no. of nodes:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the cost adjacency matrix:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				cost[i][j]=sc.nextInt();
		}
		System.out.println("Enter the source vertex:");
		v=sc.nextInt();
		shortest(v,cost,dist,n);
		System.out.println("All pairs shortest path are:");
		for(i=1;i<=n;i++)
		{
			System.out.println(v+"-->"+n+"="+dist[i]);
		}
	}
}