package companyquestions;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the size");
		int n = s.nextInt();
		int[] a= new int[n];
		int i,j=-1;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		System.out.println("Enter the index");
		int index= s.nextInt();
		for(i=0;i<n;i++)
		{
			if(i==index)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(a[i]);
		
		else
			System.out.println(j);
		

	}

}
