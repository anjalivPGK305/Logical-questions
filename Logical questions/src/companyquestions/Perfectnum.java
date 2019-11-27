package companyquestions;

import java.util.Scanner;

public class Perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int sum=0,i;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
		

	}

}
