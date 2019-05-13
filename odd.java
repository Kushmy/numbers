package guvi;
import java.util.Scanner;

public class odd {
	public static void main(String[] args)
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n1++;
		while(n1<n2)
		{
			if(n1%2==1)
				System.out.println(n1);
			n1++;
		}
	}

}
