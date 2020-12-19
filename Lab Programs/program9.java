import java.util.*;
public class program9
{
	public static void main(String args[])
	{
		int cost[][]=new int[50][50];
		int n,i,j,v;
		System.out.println("Enter the no. of nodes:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the cost adjacency matrix:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				cost[i][j]=sc.nextInt();
		}
		prims(cost,n);
	}
	static void prims(int cost[][],int n)
	{
		int i,j;
		int p,q,min,mincost=0,noe=1,flag=0;
		int v[]=new int[50];
		for(i=1;i<=n;i++)
			v[i]=0;
		v[1]=1;
		while(noe!=n)
		{
			i=j=-1;
			flag=0;
			min=9999;
			for(p=1;p<=n;p++)
			{
				for(q=1;q<=n;q++)
				{

					if(p==q)
						continue;
					if(cost[p][q]<min && v[p]==1 && v[q]!=1)
					{
						min=cost[p][q];
						i=p;
						j=q;
						flag=1;
					}
				}
			}
			if(flag==0)
			{
				System.out.println("Graph is disconnected");
				System.exit(0);
			}
			if(i!=-1)
			{
				v[j]=1;
				System.out.println("("+i+","+j+")="+min);
				mincost+=cost[i][j];
				noe++;
			}
		}
		System.out.println("Cost="+mincost);
	}
}