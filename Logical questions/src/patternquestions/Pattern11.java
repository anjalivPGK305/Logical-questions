package patternquestions;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		int i,j,k;
		int n= str.length();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				char c=str.charAt(j);
				System.out.printf("%c ",c);
			}
			System.out.println();
			
		}

	}

}
