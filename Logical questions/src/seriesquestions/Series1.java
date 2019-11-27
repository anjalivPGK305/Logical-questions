package seriesquestions;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,a;
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				a=(i*i)-1;
			}
			else
			{
				a=(i*i)-2;
			}
			System.out.printf("%d ",a);
		}
		

	}

}
