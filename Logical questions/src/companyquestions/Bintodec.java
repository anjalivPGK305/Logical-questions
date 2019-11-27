package companyquestions;

import java.util.Scanner;

public class Bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int bin= s.nextInt();
		int dec=0,r,i=0;
		while(bin!=0)
		{
			r=bin%10;
			dec= dec+(int)(r*Math.pow(2,i));
			bin=bin/10;
			i++;
		}
		System.out.println(dec);
		

	}

}
