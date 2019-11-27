package companyquestions;

import java.util.Scanner;

public class Remdupfromarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		int[] a= new int[n];
		int[] temp= new int[n];
		int i,j,k;
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
					temp[i]=a[i];
					a[i]=a[j];
					a[j]=temp[i];
				}
				
			}
		}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						for(k=j;k<n-1;k++)
						{
							a[k]=a[k+1];
							
						}
						n--;
						j--;	
					}
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			/*System.out.println(a[i]);
			if(a[i]==a[j])
			{
				a[j]=a[j+1];
			}
			System.out.println(a[j]);
		}*/
		

	}

}
