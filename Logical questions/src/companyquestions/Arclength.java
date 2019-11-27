package companyquestions;

import java.util.Scanner;

public class Arclength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float pi= 3.14f;
		System.out.println("Enter the radius");
		int r= s.nextInt();
		System.out.println("Enter the angle");
		int angle= s.nextInt();
		float arclength= (2*pi*r*angle)/360;
		System.out.println(arclength);

	}

}
