package guvi1;
import java.util.Scanner;
public class quicksort {
	void sort(int a[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(a,low,high);
			sort(a,low,pi-1);
			sort(a,pi+1,high);
		}
	}
	int partition(int a[],int low,int high)
	{
		int pivot=a[high],temp;
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return(i+1);
	}
	public static void main(String[] args)
	{
		quicksort qs=new quicksort();
		int n;
		int a[]=new int[1000];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int k=0;k<n;k++)
		{
			a[k]=sc.nextInt();
		}
		 
		qs.sort(a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
