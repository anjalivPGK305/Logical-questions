package patternquestions;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j;
		char a='c',b='s',c='k';
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{				
				System.out.print(a);
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(b);
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(c);					
			}
			System.out.println();
		}

	}

}
