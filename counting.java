package guvi;
import java.util.Scanner;

public class counting {
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
