package companyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Assessfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  String str= s.nextLine();
		  String up=str.toUpperCase();
		  char c[] = up.toCharArray();
		  int freq[] = new int[c.length];
		  Arrays.sort(c);
		  int i,j;
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
