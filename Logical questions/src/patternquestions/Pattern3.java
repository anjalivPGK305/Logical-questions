package patternquestions;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the input");
		int number= s.nextInt();
		int i,j,k;
		for(i=0;i<number;i++)// i loop for row
		{
			for(j=number-i;j>1;j--)// j loop for space
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)//k loop for column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
