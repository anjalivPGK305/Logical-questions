package companyquestions;

import java.util.Scanner;

public class Countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		int count=0;
		char c[] = str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
