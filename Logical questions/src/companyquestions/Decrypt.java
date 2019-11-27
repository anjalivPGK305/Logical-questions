package companyquestions;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char c= s.next().charAt(0);
		int a= s.nextInt();
		int b= (int)c;
		int d=b-a;
		System.out.println((char)d);

	}

}
