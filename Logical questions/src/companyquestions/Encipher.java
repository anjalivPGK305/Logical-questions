package companyquestions;

import java.util.Scanner;

public class Encipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char a=s.next().charAt(0);
		int b=s.nextInt();
		int c=(int)a;
		int d=c+b;
		System.out.println((char)d);
	}
}
