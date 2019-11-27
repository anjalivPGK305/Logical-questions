package patternquestions;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1)
				{
					System.out.print("c");
				}
				else if(i==n)
				{
					System.out.print("k");
				}
				else
				{
					if(i==2 || i==n-1)
					{
						if(j==n/2 || j==n/2+1)
						{
							System.out.print("s");
						}
						else
						{
							if(i==2)
							{
							System.out.print("c");
							}
							else
							{
								System.out.print("k");
							}
						}
					}
					else
					{
						System.out.print("s");
					}
				}
			}
			System.out.println();
		}
		

	}

}
