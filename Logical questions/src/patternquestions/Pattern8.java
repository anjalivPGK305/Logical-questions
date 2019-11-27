package patternquestions;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		
		int i,j;
		for(i=0;i<number;i++)// i loop for row
		{
			char c='A';
			System.out.printf("%c ",c);
			for(j=1;j<=i;j++)// j loop for column
			{
				c++;//increment Ascii value
				System.out.printf("%c ", c);
			}
			System.out.println();
		}

	}

}
