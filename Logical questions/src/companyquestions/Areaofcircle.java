package companyquestions;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float pi=3.14f;
		System.out.println("Enter the radius");
		int r= s.nextInt();
		System.out.println("Area = "+(pi*r*r));
	}
}
