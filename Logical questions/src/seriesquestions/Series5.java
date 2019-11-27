package seriesquestions;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =s.nextInt();
		float a=0.5f;
		int b=3,i;
		for(i=1;i<=n;i++)
		{
			System.out.printf("%.1f ", a);
			a=a*b;
		}
		

	}

}
