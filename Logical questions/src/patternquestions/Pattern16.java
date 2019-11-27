package patternquestions;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<(2*i)+3;j++)
			{
				if(j==i+1)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}
			}
			System.out.println();
			
		}

	}

}
