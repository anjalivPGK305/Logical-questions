package companyquestions;

import java.util.Scanner;

public class Bintooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int bin = s.nextInt();
		int dec=0,oct=0,r1,r2,i=0;
		while(bin!=0)
		{
			r1=bin%10;
			dec=dec+(int)(r1*Math.pow(2, i));
			bin=bin/10;
			i++;
		}
		System.out.println(dec);
		i=1;
		while(dec!=0)
		{
			r2=dec%8;
			oct=oct+r2*i;
			dec=dec/8;
			i=i*10;
		}
		System.out.println(oct);

	}

}
