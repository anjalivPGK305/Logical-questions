package companyquestions;

import java.util.Scanner;

public class Countvowconsdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.nextLine();
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' ||c=='U')
			{
				c1++;
			}
			else if(c>='a' && c<='z')
			{
				c2++;
			}
			else if(c>='0' && c<='9')
			{
				c3++;
			}
			else if((c=='@') || (c=='$') || (c=='*') || (c=='#') || (c=='%'))
			{
				c5++;
			}
			else if(c==' ')
			{
				c4++;
			}
			
		}
		System.out.println("No of vowels : "+c1);
		System.out.println("No of consonants : "+c2);
		System.out.println("No of digits : "+c3);
		System.out.println("No of whitespace : "+c4);
		System.out.println("No of symbols : "+c5);
		

	}

}
