package guvi1;

import java.util.Scanner;

public class min {
	public static void main(String[] args)
	{
		int n,min;
		int a[]=new int[10000];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		 a[i]=s.nextInt();
		min=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
		
	}

}
