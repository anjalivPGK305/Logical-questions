package companyquestions;

import java.util.Scanner;

public class Primefromrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int lower= s.nextInt();
		System.out.println("Enter the upper limit");
		int upper = s.nextInt();
		int i,j,count=0;
		for(i=lower+1;i<upper;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				else
				{
					count=0;
				}
			}
			if(count==0)
			{
				System.out.printf("%d ",i);
			}
		}

	}

}
