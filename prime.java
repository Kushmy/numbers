package guvi;
import java.util.Scanner;
public class prime {
 public static void main(String[] args)
 {
	 int num,range,nof=0;
	 Scanner sc=new Scanner(System.in);
	 num=sc.nextInt();
	 range=num/2;
	 for(int i=2;i<=range;i++)
	 {
		 if((num%i)==0)
			 nof++;			 
	 }
	 if(nof==0)
		 System.out.println("yes");
	 else
		 System.out.println("no");
 }
}
