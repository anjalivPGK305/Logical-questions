package companyquestions;

import java.util.Scanner;

public class Pallindromestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		String rev="";
		int len=str.length();
		int i;
		for(i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.contentEquals(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not pallindrome");
		}

	}

}
