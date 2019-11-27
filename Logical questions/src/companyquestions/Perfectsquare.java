package companyquestions;

import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int sqrt= (int)Math.sqrt(n);
		int p=sqrt*sqrt;
		if(n==p)
		{
			System.out.println("Perfect square");
		}
		else
		{
			System.out.println("Not a perfect square");
		}
		

	}

}
