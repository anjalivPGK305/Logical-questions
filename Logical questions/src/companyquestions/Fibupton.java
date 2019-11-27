package companyquestions;

import java.util.Scanner;

public class Fibupton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = s.nextInt();
		int a=0,b=1;
		System.out.printf("%d %d ",a,b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.printf("%d ", c);
		}

	}

}
