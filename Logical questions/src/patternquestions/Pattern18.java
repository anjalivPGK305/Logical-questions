package patternquestions;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,b=0,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j || (i+j)==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(b);
				}
			}
			System.out.println();
		}

	}

}
