package patternquestions;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int k=1,l=0,i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(l);
				}
				else
				{
					System.out.print(k);
				}
			}
			k++;
			System.out.println();
		}
		

	}

}
