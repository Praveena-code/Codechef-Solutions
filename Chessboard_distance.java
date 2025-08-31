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
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y1=sc.nextInt();
		    int y2=sc.nextInt();
		    int distance1=Math.abs(x1-y1);
		    int distance2=Math.abs(x2-y2);
		    System.out.println(Math.max(distance1,distance2));
		    
		}

	}
}
