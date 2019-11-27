package companyquestions;

import java.util.Scanner;

public class Deletevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		String a= str.replaceAll("[AEIOUaeiou]","");
		System.out.print(a);
	}
}
