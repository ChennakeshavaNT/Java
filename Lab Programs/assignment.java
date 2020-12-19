import java.util.*;
public class assignment {
	static int a[][]=new int[50][50];
	static int visited[]=new int[50];
	static int n,mincost,ck=1,min1=0;
	static int path[]=new int [50];
	static int s[]=new int[50];

	static int Tsp_Dynamic(int i,int copy[])
	{
		int j,val,min=999;
		boolean flag=false;
		for(j=1;j<=n;j++)
			s[j]=copy[j];
		s[i]=1;
		if(n==1)
			return a[i][1];
		for(j=1;j<=n;j++)
		{
			if(s[j]==0)
			{
				flag=true;
				path[j]=ck;
				ck++;
				
				val=a[i][j]+Tsp_Dynamic(j,s);
				
				if(val<min){
					min=val;
				}
			}
		}
		if(!flag)
			min=a[i][1];
		return min;
		
	}
	public static void main(String args[])
	{
		int i,j;
		System.out.println("Enter the no. of nodes");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the cost adjacency matrix");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Enter the Source Vertex(<"+n+"):");
		int v=sc.nextInt();
		mincost=Tsp_Dynamic(v,visited);
		System.out.println("the Optimal tour path is");
		for(i=1,j=n;i<=n;i++,j--)
		{
			if(s[i]==1)
				{
					
					System.out.print(i+"---->");
				}
		}
		System.out.println("1\nOptimal tour="+mincost);
	}
}