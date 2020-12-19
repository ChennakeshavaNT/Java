import java.util.*;
import java.io.*;

public class HA02G02
{
	
	public static int binarySearch(int input[],int ele)//Helper function to intialize the pre-requesites of binary search 
	{
		int start,end;
		start=0;//starting index of array
		end=input.length-1;//ending index of array
		return binarySearch(input,ele,start,end);//function call for the Actual Binary Search algorithm
	}
	public static int binarySearch(int input[],int ele,int start,int end)//Binary search function
	{
		if(start>end)//initial test conditon
		{
			if(input[end]==ele)
				return end;
			else
				return -1;
		}
		int mid=(start+end)/2;//calculation mid
		if(input[mid]==ele)
			return mid;
		else if(input[mid]==ele)
			return binarySearch(input,ele,start,mid-1);//Recursive Function call
		else
			return binarySearch(input,ele,mid+1,end);//Recursive Function call

	}
	public static void findm(int a[],int n,int x)throws IOException
	{
		int tempm = 1,i=0,temp=0;int m=0;int count=0;;//variables for calculation
		PrintWriter sort = new PrintWriter(new File("Sorted.txt"));//creation of sorted.txt file
		System.out.println("Basic Operation : Comparision of two variables");
		while(tempm!=n) //logic to find temporary value of m 
		{					
			if(tempm<=n)
			{
				if(a[tempm]==-1)
					break;
				else if(tempm>n)
				{
					tempm=n-1;
					break;
				}
				else {
					temp=tempm;
					tempm=(int) Math.pow(2,i);//usage of power of n function
					i++;
				}
			}
			count++;
		}
		i=temp;	
		while(i>=temp)//finding final value of m
		{
			if(i>tempm){
				break;
			}
			else{
				if(a[i]==-1){
					m=i;
					break;
				}
				else
					i++;
			}
		}
		System.out.println("Calculated value of M:"+m);//displaying value of calculated m
		System.out.println("Total Number of Comparisions :"+(count-1));
		int b[]=new int[m];
		for(int j=0;j<m;j++)//using temporary array to sort the elements
			b[j]=a[j];
		Arrays.sort(b);//sorting the generated array upto m elements
		for(int j=0;j<m;j++)
			a[j]=b[j];//modifying the original array elements with the sorted elements of temporary array upto m elements
		for(int ck=0;ck<n;ck++)
			sort.print(a[i]+"\t");//
		System.out.print("Array elements can be found in Sorted.txt File");
		int res=binarySearch(a,x);
		if(res<0)
			System.out.println("\n................Element "+x+" not found.................");
		else
			System.out.println("\nElement "+x+" found at location "+(res+1));
	}
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		try {
		int n,x;
		//int n=Integer.parseInt(args[0]);//parameter 1(n) which is Size of array
		//int x=Integer.parseInt(args[1]);//parameter 2(x) which is Element to be found
		System.out.println("Enter n");
		n=sc.nextInt();
		System.out.println("Enter x");
		x=sc.nextInt();
		if(x>n)
		{
			System.out.println(".............Element "+x+" not found.............");
			System.exit(0);
		}	
		int a[] = new int[n];
		System.out.println("Entered Size of array is "+n);//displays the value of n
		Random ran = new Random();
		PrintWriter ele = new PrintWriter(new File("element.txt"));//Creation of Element.txt file
		int m=ran.nextInt(n);//value of m is randomly generated
		double min=Math.sqrt(n);
		double mid=m/2;
		int tempmin=(int)min;
		if(m<min)
			m=(int)(min+mid);
		System.out.println("The Range in which 'M' value to be generated : "+tempmin+" <= M <= "+n);
		for (int i=0;i<m;i++)
			a[i]=ran.nextInt(n);//random elements are generated and stored in array
		for (int i=m;i<n;i++)
			a[i]=-1;
		for(int i=0;i<n;i++)
			ele.print(a[i]+"\t");//storing the elements Generated in Element.txt file 
		ele.println("Value of m:"+m);
		ele.close();
		System.out.println("Randomly Generated Value of M: "+m);//Display of Randomly generated m value
		findm(a,n,x);//function call of function which finds the value of m
		}
		catch(Exception e) {
			System.out.println("Invalid input ");
		}
	}
}
