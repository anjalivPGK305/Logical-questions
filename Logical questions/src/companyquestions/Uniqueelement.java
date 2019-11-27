package companyquestions;

import java.util.Scanner;

public class Uniqueelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		int i,j,c=1;
		int[] a = new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
	
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			}
			
			if(i==j)
			{
				System.out.println(a[i]);
			}
			
		}

	}

}
