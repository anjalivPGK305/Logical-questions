package companyquestions;

import java.util.Scanner;

public class Deletevowel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.nextLine();
		int n= str.length();
		char c;
		int i;
		for(i=0;i<n;i++)
		{
			c= str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' ||c=='I' ||c=='O' || c=='U')
			{
				System.out.print("");
			}
			else
			{
				System.out.print(c);
			}
		}

	}

}
