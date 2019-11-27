package patternquestions;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=i+1;j>0;j--)
			{
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		

	}

}
