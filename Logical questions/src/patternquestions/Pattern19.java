package patternquestions;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j;
		for(i=0;i<=n;i++)
		{

			for(j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
				for(j=n;j>=1;j--)
				{
					if(j<=i)
					{
						System.out.print(j);
					}
				}
				System.out.println();
				
					
				}

	}

}
