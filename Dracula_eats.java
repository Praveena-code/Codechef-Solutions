import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int days_left = sc.nextInt();
		    System.out.println((int)Math.ceil((double)(days_left-1)/7.0));
		    
		}

	}
}
