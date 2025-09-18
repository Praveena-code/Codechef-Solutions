import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int monthly = sc.nextInt();
		    int total = sc.nextInt();
		    System.out.println((total-1)/monthly);
		}

	}
}
