package companyquestions;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base");
		int base= s.nextInt();
		System.out.println("Enter the altitude");
		int altitude= s.nextInt();
		int sqr= (base*base)+(altitude*altitude);
		double hypotenuse= Math.sqrt(sqr);
		System.out.println(hypotenuse);

	}

}
