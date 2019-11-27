package patternquestions;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		int i,j;
		int n= str.length();
		for(i=n;i>=0;i--)//i loop for row
		{
			for(j=0;j<i;j++)//j loop for column
			{
				char c=str.charAt(j);
				System.out.printf("%c ",c);
			}
			System.out.println();
		}
		

	}

}
