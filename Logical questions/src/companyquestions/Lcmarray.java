package companyquestions;

import java.util.Scanner;

public class Lcmarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		int[] a= new int[n];
		int i,j,k,min=0,max=0,x,lcm=0;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					min=a[j];
					max=a[i];
				}
				else
				{
					min=a[i];
					max=a[j];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
		for(k=0;k<n;k++)
		{
			x=k*max;
			if(x%min==0)
			{
				lcm=x;
			}
		}
		System.out.println(lcm);

	}

}
