package companyquestions;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= s.nextInt();
		int b= s.nextInt();
		int max,lcm=0;
		max=(a>b)?a:b;
		for(int i=max;i<a*b;i++)
		{
			if(i%a==0 && i%b==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);

	}

}
