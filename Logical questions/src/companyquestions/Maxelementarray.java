package companyquestions;

import java.util.Scanner;

public class Maxelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		int[] a= new int[n];
		int i,max=0;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		

	}

}
