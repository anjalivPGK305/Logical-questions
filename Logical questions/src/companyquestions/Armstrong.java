package companyquestions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b,count=0,sum=0,r;
		System.out.println("Enter the number");
		int n= s.nextInt();
		a=n;
		b=n;
		while(b!=0)
		{
			count++;
			b=b/10;
		}
		while(n!=0)
		{
			r=n%10;
			sum= (int)((double)sum+Math.pow(r, count));
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not armstrong");

	}

}
