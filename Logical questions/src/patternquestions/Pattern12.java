package patternquestions;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= s.nextInt();
		int i,j,k;
		for(i=0;i<number-2;i++)//i loop for row
		{
			for(j=number-1;j>i;j--)//j loop for space
			{
				System.out.print(" ");
			}
			for(k=0;k<(i*2)-1;k++)//k loop for column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=number-2;i>=0;i--)//i loop for row
		{
			for(j=number-2;j>=i;j--)//j loop for space
			{
				System.out.print(" ");
			}
			for(k=0;k<(i*2)-1;k++)//k loop for column
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
