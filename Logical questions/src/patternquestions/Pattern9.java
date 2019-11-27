package patternquestions;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= s.nextInt();
		char c='A';
		int i,j;
		for(i=0;i<number;i++)//i loop for row
		{
			for(j=0;j<=i;j++)// j loop for column
			{
				System.out.printf("%c ", c);
				c++;// increment ascii value
			}
			System.out.println();
		}

	}

}
