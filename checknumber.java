package guvi;
import java.util.*;

public class checknumber {
public static void main(String[] args)
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	if(num==0)
		System.out.println("Zero");
	else if(num>0)
		System.out.println("Positive");
	else
		System.out.println("Negative");
}
}
