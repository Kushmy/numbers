package guvi;
import java.util.Scanner;

public class natural {
public static void main(String[] args)
{
	int n,sum=0;
	Scanner m=new Scanner(System.in);
	n=m.nextInt();
	for(int i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}
