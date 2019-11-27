package companyquestions;

import java.util.Scanner;

public class Lengthofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		int i=0;
		for(char c:str.toCharArray()) {
			i++;
		}
		System.out.println("Length of string is "+i);
		

	}

}
