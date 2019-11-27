package companyquestions;

import java.util.Scanner;

public class Missingalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		int l = str.length();
		str.toLowerCase();
		boolean f=false;
		for(char c='a';c<='z';c++)
		{
			f=false;
			for(int i=0;i<l;i++)
			{
				if(str.charAt(i)==c)
				{
					f=true;
					break;
				}
			}
			
			if(f==false)
			{
				System.out.print(c);
				break;
			}
		}
		
		

	}

}
