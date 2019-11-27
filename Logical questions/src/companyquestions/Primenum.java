package companyquestions;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =s.nextInt();
		int i,flag=0;
		if(n==1)
			flag=1;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}

}
