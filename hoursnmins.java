package guvi1;
import java.util.Scanner;
public class hoursnmins {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int time,hrs,mins;
		time=sc.nextInt();
		hrs=time/60;
		mins=time%60;
		System.out.println(hrs+" "+mins);
		
	}

}
