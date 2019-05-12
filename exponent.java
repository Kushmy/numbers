package guvi;
import java.util.Scanner;

public class exponent {
	public static void main(String[] args)
	{
		int n1,n2,exp=1;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		for(int i=0;i<n2;i++)
		{
			exp=exp*n1;
		}
		System.out.println(exp);
	}

}
