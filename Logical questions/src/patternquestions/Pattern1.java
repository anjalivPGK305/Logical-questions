package patternquestions;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input");
		int n= s.nextInt();
		int i,j;
		for(i=0;i<n;i++)// i loop for row
		{
			for(j=0;j<=i;j++)// j loop for column
			{
				System.out.print("* ");
			}
			System.out.println();// to enter to new line
		}
		

	}

}
