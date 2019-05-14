package guvi1;
import java.util.Scanner;
public class ap {
	public static void main(String[] args)
	{
		int a,n,d,sum=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		n=sc.nextInt();
		d=sc.nextInt();
		sum = (n*((2*a)+((n-1)*d)))/2;
		System.out.println(sum);
	}

}
