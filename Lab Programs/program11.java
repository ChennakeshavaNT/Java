import java.util.*;
public class program11
{
	static int x[]=new int[50];
	static int s[]=new int[50];
	static int flag=0,d;
	static void sumofsub(int l,int k,int r)
	{
		int i;
		x[k]=1;
		if(l+s[k]==d)
		{
			flag=1;
			for(i=1;i<=k;i++)
			{
				if(x[i]==1)
					System.out.print(s[i]+"\t");
			}
			System.out.println();
		}
		else
		{
			if(l+s[k]+s[k+1]<=d)
			{
				sumofsub(l+s[k],k+1,r-s[k]);
			}
			if((l+r-s[k] >=d) && (l+s[k+1]<=d))
				x[k]=0;
				sumofsub(l,k+1,r-s[k]);
		}
	}
	public static void main(String args[])
	{
		int n,sum=0,i;
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(i=1;i<=n;i++)
			s[i]=sc.nextInt();
		System.out.println("Enter the max sum");
		d=sc.nextInt();
		for(i=1;i<=n;i++)
			sum+=s[i];
		if((sum<d)||(s[1]>d))
			System.out.println("No subset");
		else
		{
			System.out.println("Subsets are:");
			sumofsub(0,1,sum);
			if(flag==0)
				System.out.println("No subsets possible");
		}
	}
}