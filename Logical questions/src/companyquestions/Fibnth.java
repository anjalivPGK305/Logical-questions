package companyquestions;

import java.util.Scanner;

public class Fibnth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int a=0,b=1,c=0;
		if(n==1)
			System.out.print(a);
		if(n==2)
			System.out.print(b);
		if(n>2)
		{
			for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
			System.out.println(c);
		}
		
		

	}

}
