package companyquestions;

import java.util.Scanner;

public class Searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		int i,flag=0;
		int[] a= new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		System.out.println("Element to be searched");
		int e = s.nextInt();
		for(i=0;i<n;i++)
		{
			if(e==a[i])
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element not present");
		}

	}

}
