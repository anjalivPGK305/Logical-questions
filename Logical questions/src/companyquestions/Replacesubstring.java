package companyquestions;

import java.util.Scanner;

public class Replacesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.nextLine();
		System.out.println("Enter the substrings");
		String sub1= s.nextLine();
		String sub2= s.nextLine();
		str=str.replace(sub1,sub2);
		System.out.println(str);

	}

}
