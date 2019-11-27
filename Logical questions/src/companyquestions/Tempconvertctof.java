package companyquestions;

import java.util.Scanner;

public class Tempconvertctof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in centigrade");
		float c = s.nextFloat();
		float a=1.8f;
		float f = (a*c)+32;
		System.out.println(f);
		 

	}

}
