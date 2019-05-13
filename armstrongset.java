package guvi1;
import java.util.Scanner;
public class armstrongset {
public static void main(String[] args)
{
	int num1,num2;
	Scanner sc=new Scanner(System.in);
	num1=sc.nextInt();
	num2=sc.nextInt();
	for(int i=num1;i<num2;i++)
	{
		int digit,sum=0,temp;
	temp=i;
	while(temp!=0)
	{
		digit=temp%10;
		sum=sum+(digit*digit*digit);
		temp=temp/10;
	}
	if(i==sum)
		System.out.println(i);
	}
	
}
}
