import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int total=sc.nextInt();
		    int leftremain=sc.nextInt();
		    System.out.println(total + Math.max(0,total-leftremain ));
		}

	}
}
