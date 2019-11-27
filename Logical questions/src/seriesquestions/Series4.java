package seriesquestions;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int a=4,i;
		for(i=1;i<=n;i++)
		{			
			System.out.printf("%d ", a);
			a=a+(i*i);
		}
		

	}

}
