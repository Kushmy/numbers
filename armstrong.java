package guvi;
import java.util.Scanner;
public class armstrong {
public static void main(String[] args)
{
	int num,digit,sum=0,temp;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	temp=num;
	while(num!=0)
	{
		digit=num%10;
		sum=sum+(digit*digit*digit);
		num=num/10;
	}
	if(temp==sum)
		System.out.println("yes");
	else
		System.out.println("no");
}
}
