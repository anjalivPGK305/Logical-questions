package patternquestions;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input");
		int number = s.nextInt();
		int i,j;
		for(i=0;i<number;i++)// i loop for row
		{
			for(j=number-1;j>=i;j--)// j loop for column
			{
				System.out.print("* ");
			}
			System.out.println();// to goto newline
		}
		

	}

}
