package seriesquestions;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
		String a= s.next();
		String b= s.next();
		String c= s.next();
		char c1[]=a.toCharArray();
		char c2[]=b.toCharArray();
		char c3[]=c.toCharArray();
		int l1=c1.length;
		int l2=c2.length;
		int l3=c3.length;
		int i;
		String g="";
		for(i=0;i<l1;i++)
		{
			if(c1[i]=='a' || c1[i]=='e' || c1[i]=='i' || c1[i]=='o' || c1[i]=='u' || c1[i]=='A' || c1[i]=='E' || c1[i]=='I' || c1[i]=='O' || c1[i]=='U')
			{
				c1[i]='$';
			}
		}
		for(i=0;i<l2;i++)
		{
			if(c2[i]!='a' && c2[i]!='e' && c2[i]!='i' && c2[i]!='o' && c2[i]!='u' && c2[i]!='A' && c2[i]!='E' && c2[i]!='I' && c2[i]!='O' && c2[i]!='U') {
				c2[i]='#';
			}
		}
		for(i=0;i<l3;i++)
		{
			g=c.toUpperCase();
		}
		String m=new String(c1);
		String n=new String(c2);
	    m=m.concat(n);
		m=m.concat(g);
		System.out.println(m);
		
		

	}

}
