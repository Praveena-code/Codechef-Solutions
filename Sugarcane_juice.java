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
		    int n=sc.nextInt();
		    int m=50*n;
		    double a=(double)m-((m*0.20)+(m*0.20)+(m*0.30));	
		    System.out.println((int)a);
		}

	}
}
