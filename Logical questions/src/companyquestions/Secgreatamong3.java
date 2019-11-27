package companyquestions;

import java.util.Scanner;

public class Secgreatamong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int secmax=0;
		if(num1>num2 && num1<num3)
		{
			secmax=num1;
		}
		else if(num2<num3)
		{
			secmax=num2;
		}
		else
		{
			secmax=num3;
		}
		System.out.println(secmax);

	}

}
