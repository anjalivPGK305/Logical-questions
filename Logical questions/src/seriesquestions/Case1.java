package seriesquestions;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i;
		for(i=3;i<=n;i++)
		{
			if(i%2!=0)
			{
			c=a+2;
			a=c;
			}
			else
			{
				c=b+1;
				b=c;
			}
		}
		System.out.println(c);

	}

}
