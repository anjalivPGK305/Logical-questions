package companyquestions;

import java.util.Scanner;

public class Subsetof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		int[] a= new int[n];
		int i,j,k;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		System.out.println("Subset of 3");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1;k<n;k++)
				{
					System.out.printf("(%d,%d,%d)\n",a[i],a[j],a[k]);
				}
			}
		}
		

	}

}
