import java.util.*;
import java.io.*;
public class program4
{
	static int a[];
	static int n;
	static boolean flag=true;
	static void quicksort(int a[],int low,int high)
	{
		int temp,i=low,j=high;
		int pivot=a[(low+high)/2];
		if(flag)
		{
		while(i<=j)
		{
			if(a[i]<pivot)
				i++;
			if(a[j]>pivot)
				j--;
			if(i<=j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		if(low<j)
			quicksort(a,low,j);
		if(i<high)
			quicksort(a,i,high);
	}
	else
	{
		while(i<=j)
		{
			if(a[i]>pivot)
				i++;
			if(a[j]<pivot)
				j--;
			if(i<=j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		if(low<j)
			quicksort(a,low,j);
		if(i<high)
			quicksort(a,i,high);
	}
	}
public static void main(String args[]) throws IOException
{
	long st,et;
	int i;
	System.out.println("Enter the no. of elements:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	Random r=new Random();
	PrintWriter out=new PrintWriter(new File("Random.txt"));
	a=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=r.nextInt(n)+1;
		out.print(a[i]+"\t");
	}
	System.out.println("Total random numbers generated:"+i);
	out.close();
	st=System.nanoTime();
	quicksort(a,0,n-1);
	et=System.nanoTime()-st;
	PrintWriter outA=new PrintWriter(new File("Ascending.txt"));
	for(i=0;i<n;i++)
		outA.print(a[i]+"\t");
	outA.close();
	System.out.println("Time complexity for worst case is:"+(et/1000000000.0));
	st=System.nanoTime();
	quicksort(a,0,n-1);
	et=System.nanoTime()-st;
	System.out.println("Time complexity for best case is:"+(et/1000000000.0));
	flag=false;
	st=System.nanoTime();
	quicksort(a,0,n-1);
	et=System.nanoTime()-st;
	PrintWriter outD=new PrintWriter(new File("Descending.txt"));
	for(i=0;i<n;i++)
		outD.print(a[i]+"\t");
	outD.close();
	System.out.println("Time complexity for average case is:"+(et/1000000000.0));	
}
}