package guvi1;
import java.util.Scanner;
public class index {
	public static void main(String[] args)
	{
		int n;
		int arr[]=new int[10000];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" "+i);
		
	}

}
