package guvi1;
import java.util.Scanner;
import java.lang.*;
public class difference {
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		int hr1,min1,hr2,min2;
		hr1=scn.nextInt();
		min1=scn.nextInt();
		hr2=scn.nextInt();
		min2=scn.nextInt();
		int diff1,diff2;
		diff1=hr1-hr2;
		diff2=min1-min2;
		System.out.println(Math.abs(diff1)+" "+Math.abs(diff2));
	}

}
