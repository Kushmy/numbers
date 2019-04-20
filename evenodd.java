package guvi;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args)
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		if(num>0 && num%2==0)
			System.out.println("Even");
		else if(num>0 && num%2==1)
			System.out.println("Odd");
		else
			System.out.println("Invalid");
	}
}
