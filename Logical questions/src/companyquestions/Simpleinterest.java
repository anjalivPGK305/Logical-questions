package companyquestions;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("year");
		int n= s.nextInt();
		System.out.println("rate of interest");
		int r = s.nextInt();
		System.out.println("Principle amount");
		int p = s.nextInt();
		int si = (p*n*r)/100;
		System.out.println(si);

	}

}
