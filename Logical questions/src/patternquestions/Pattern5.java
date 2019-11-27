package patternquestions;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= s.nextInt();
		int i,j,k;
		for(i=0;i<number;i++)
		{
			for(j=number-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
