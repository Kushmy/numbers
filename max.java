package guvi1;
import java.util.Scanner;
public class max {
public static void main(String[] args)
{
	int n,max;
	int a[]=new int[10000];
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	max=a[0];
	for(int i=0;i<n;i++)
	{
		if(max<a[i])
			max=a[i];
	}
	System.out.println(max);
	
}
}
