package patternquestions;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,j,k,l=1;
		for(i=0;i<n;i++)
		{
			k=1;
			for(j=0;j<=i;j++)
			{			
				System.out.printf("%d ", k);
				l=k+l;
				System.out.printf("%d ", l);
			}
				
			System.out.println();
		}

	}

}
