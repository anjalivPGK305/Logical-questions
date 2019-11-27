package companyquestions;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			int min,hcf=0;
			min=(a<b)?a:b;
			for(int i=min;i>0;i--)
			{
				if(a%i==0 && b%i==0)
				{
					hcf=i;
					break;
				}
			}
			System.out.println(hcf);

		}

}
