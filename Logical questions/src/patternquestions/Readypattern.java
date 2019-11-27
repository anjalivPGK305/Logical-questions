package patternquestions;

import java.util.Scanner;

public class Readypattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  String str= s.next();
		  int n= str.length();
		  int i,j,k;
		  char c[]= str.toCharArray();
		  for(i=0;i<n;i++)
		  {
			  for(j=0;j<=i;j++)
			  {
				  System.out.printf("%c ",c[j]);
			  }
			  System.out.println();
		  }
		  for(i=n-2;i>=0;i--)
		  {
			  for(k=0;k<=i;k++)
			  {
				  System.out.printf("%c ",c[k]);
			  }
			  System.out.println();
		  }
	  
	

	}

}
