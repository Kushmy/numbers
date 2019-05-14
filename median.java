package guvi1;

import java.util.Scanner;

public class median {
	public static void main(String[] args)
	{
		int a[]=new int[1000];
		int n,temp,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		 {
			a[i]=s.nextInt();
			sum=sum+a[i];  
		 }
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(n%2!=0)
			System.out.println(a[n/2]);
		else
			System.out.println(a[(n-1)/2]+a[n/2]);
		
	}
}
