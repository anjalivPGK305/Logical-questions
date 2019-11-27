package companyquestions;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int num=n;
		int fact,i,strong=0;
		
		while(n!=0)
		{
			fact=1;
			int t=n%10;
			for(i=1;i<=t;i++)
			{
				fact=fact*i;
			}
			strong=strong+fact;
			n=n/10;
		}
		if(num==strong)
		{
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
			
		

	}

}
