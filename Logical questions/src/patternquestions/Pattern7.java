package patternquestions;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		int i,j;
		char c=64;
		for(i=0;i<number;i++)//i loop for row
		{
			c++;
				for(j=0;j<=i;j++)// j loop for column
				{
					System.out.printf("%c ", c);
				}
				System.out.println();
		}

	}

}
