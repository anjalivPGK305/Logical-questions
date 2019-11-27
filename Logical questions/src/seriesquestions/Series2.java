package seriesquestions;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,c;
		int a=4,b=11;
		for(i=0;i<n;i++)
		{
			c=b*b;
			System.out.printf("%d ", c);
			b=b+a;
		}

	}

}
