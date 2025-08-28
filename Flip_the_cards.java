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
		    int faceup=sc.nextInt();
		    int facedown=total-faceup;
		    System.out.println(Math.min(faceup, facedown));
		}

	}
}
