package companyquestions;
import java.util.Scanner;
public class Arrayinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    int i,insert,pos;
	    System.out.println("Enter the size");
	    int n = s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter the array elements");
	    for(i=0;i<n;i++)
	    {
	      arr[i] = s.nextInt();
	    }
	    System.out.println("Enter the position");
	    pos = s.nextInt();
	    System.out.println("Element to be inserted");
	    insert = s.nextInt();  
	    for(i=0;i<pos-1;i++)
	    {
	      System.out.println(arr[i]);
	    }
	    System.out.println(insert);
	  	for(i=pos-1;i<n;i++)
	  	{
	    System.out.println(arr[i]);
	  }

	}

}
