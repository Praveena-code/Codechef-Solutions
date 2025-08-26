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
		    int range =sc.nextInt();
		    int denomi=sc.nextInt();
		    int numera=sc.nextInt();
		    if(numera%denomi==0 && numera/denomi <= range){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
