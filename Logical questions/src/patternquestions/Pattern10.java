package patternquestions;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= s.nextInt();
		int i,j;
		char c='A';
		for(i=number;i>=0;i--)// i loop for row
		{
			for(j=i;j>0;j--)// j loop for column
			{
				System.out.printf("%c ", c+j-1);
			}
			System.out.println();
		}
		
		

	}

}
