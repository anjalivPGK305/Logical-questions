package seriesquestions;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int i,a=1;
		float b=2.0f,c;
		System.out.printf("%d ", a);
		System.out.printf("%.1f ",b);
		for(i=3;i<=n;i++)
		{
			if(i%2!=0)
			{
				a=a*3;
				c=a;
				System.out.printf("%.1f ",c);
			}
			else
			{
				b=b*3;
				System.out.printf("%.1f ",b);
			}
		}
		

	}

}
