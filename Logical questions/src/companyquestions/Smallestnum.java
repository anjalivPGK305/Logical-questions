package companyquestions;

import java.util.Scanner;

public class Smallestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int min=0;
		System.out.println("Enter the numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int num4 = s.nextInt();
		int num5 = s.nextInt();
		if(num1<num2 && num1<num3 && num1<num4 && num1<num5)
		{
			min=num1;
		}
		else if(num2<num3 && num2<num1 && num2<num4 && num2<num5)
		{
			min=num2;
		}
		else if(num3<num1 && num3<num2 && num3<num4 && num3<num5)
		{
			min=num3;
		}
		else if(num4<num1 && num4<num2 && num4<num3 && num4<num5)
		{
			min=num4;
		}
		else
		{
			min=num5;
		}
		System.out.println(min);
		
	}

}
