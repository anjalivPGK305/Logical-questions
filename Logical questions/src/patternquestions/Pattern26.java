package patternquestions;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j,k;
		for(i=0;i<2;i++)
		{
			for(j=0;j<=1;j++)
			{
				System.out.print("c");
			}
			for(j=i;j<n-2;j++)
			{
				System.out.print("s");
			}
			for(j=n-2;j<n;j++)
			{
				System.out.print("k");
			}
		}

	}

}
