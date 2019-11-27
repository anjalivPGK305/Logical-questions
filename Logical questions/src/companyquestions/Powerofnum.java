package companyquestions;

import java.util.Scanner;

public class Powerofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int result=1;
		System.out.println("Enter the base");
		int base = s.nextInt();
		System.out.println("Enter the exponent");
		int exponent= s.nextInt();
		while(exponent!=0)
		{
			result= result*base;
			exponent--;
		}
		System.out.println(result);

	}

}
