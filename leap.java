package guvi;
import java.util.Scanner;
public class leap {
	public static void main(String[] args)
	{
		int yr;
		Scanner s=new Scanner(System.in);
		yr=s.nextInt();
		if(yr%400==0 || yr%4==0 && yr%100!=0)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}

}
