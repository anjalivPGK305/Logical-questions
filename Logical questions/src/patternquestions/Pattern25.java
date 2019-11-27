package patternquestions;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j,k;
		for(i=0;i<1;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("c");
			}
			System.out.println();
		}
		for(i=1;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==n-1)
				{
					System.out.print("k");
				}
				else if(i==1 && (j==0 || j==i+1 || j==n-1))
				{
					System.out.print("*");
				}

				
			}
			System.out.println();
		}
		

	}

}
