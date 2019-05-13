package guvi;
import java.util.Scanner;
public class primeset {
	
	
	 public static void main(String[] args)
	 {
		 int num1,num2,nof=0;
		 Scanner sc=new Scanner(System.in);
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 for(int i=num1;i<num2;i++)
		 {
		 nof=0;
		 for(int j=2;j<=(i/2);j++)
		 {
			 if((i%j)==0)
			 {
				 nof++;
			 break;
			 }
		 }
		 if(nof==0 && i!=1)
			 System.out.println(i);
		 
		 }
	 }
	}

