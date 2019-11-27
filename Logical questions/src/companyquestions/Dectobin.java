package companyquestions;

import java.util.Scanner;

public class Dectobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		String str="";
		System.out.println("Enter the input");
		int n=s.nextInt();
		while(n>0)
		{
			a=n%2;
			str= a+str;
			n=n/2;
		}
		System.out.print(str);
		
	}

}
