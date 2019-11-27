package companyquestions;

import java.util.Scanner;

public class Reverseorderfib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter limit");
		int n= s.nextInt();
		int[] a= new int[n];
		a[0]=0;
		a[1]=1;
		int i;
		for(i=2;i<n;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		for(i=n-1;i>=0;i--)
		{
			System.out.printf("%d ", a[i]);
		}

	}

}
