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
		    int per_frame=sc.nextInt();
		    int distance=sc.nextInt();
		    int many=sc.nextInt();
		    int tt=distance/per_frame;
		    System.out.println(Math.max(0, many-tt));
		}

	}
}
