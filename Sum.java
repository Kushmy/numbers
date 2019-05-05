package guvi;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args)
	{
		int n1,n2,sum=0;
		int[] a=new int [10];
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n2;i++)
			sum=sum+a[i];
		System.out.println(sum);
		
	}

}
