package patternquestions;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= s.nextInt();
		int i,j,k,l;
		for(i=0;i<number;i++)
		{
			for(j=i;j<number;j++)
			{
				System.out.print("*");
			}
			for(k=0;k<i*2-2;k++)
			{
				System.out.print(" ");
			}
			for(l=i;l<number;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=0;i<number;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(k=i*2-3;k<number*2-3;k++)
			{
				System.out.print(" ");
			}
			for(l=0;l<i;l++)
			{
				System.out.print(" ");
			}
			System.out.println();
			}

	}

}
