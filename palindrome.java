package guvi;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		int num,rev=0,digit,temp;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
		if(temp==rev)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
