package companyquestions;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int r,rev=0;
		int num=n;
		while(n!=0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;			
		}
		if(num==rev)
			System.out.println("Pallindrome");
		else
			System.out.println("Not pallindrome");
		

	}

}
