package companyquestions;

import java.util.Scanner;

public class Freqofalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.nextLine();
		int[] freq = new int[str.length()];
		int i,j;
		
		char c[] = str.toCharArray();
		for(i=0;i<c.length;i++)
		{
			freq[i]=1;
			for(j=i+1;j<c.length;j++)
			{
			if(c[i]==c[j])
			{
				freq[i]++;
				c[j]='0';
			}
			}
		}
		for(i=0;i<freq.length;i++)
		{
			if(c[i]!=' ' && c[i]!='0')
			{
				System.out.println(c[i]+"-"+freq[i]);
			}
		}
		
	}

}
