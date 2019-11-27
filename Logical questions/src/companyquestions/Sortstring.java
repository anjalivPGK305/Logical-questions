package companyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		char c[] =str.toCharArray();
		//Arrays.sort(c);
		int i,j;
		char temp;
		for(i=0;i<c.length;i++)
		{
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]);
		}

	}

}
