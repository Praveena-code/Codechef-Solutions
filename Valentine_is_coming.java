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
		    int money=sc.nextInt();
		    int eachcost=sc.nextInt();
		    System.out.println(Math.max(0,money/eachcost));
		}

	}
}
