package patternquestions;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j;
		for(i=0;i<1;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("c ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==n)
				{
					System.out.print("k ");
				}
				else if(j==0 || j==(n-1))
				{
					System.out.print("s ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		

	}

}
