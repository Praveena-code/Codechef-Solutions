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
		    int hers=sc.nextInt();
		    int desired =sc.nextInt();
		    if(hers==desired){
		        System.out.println("0");
		    }
		    else{
		        int excess=desired-hers;
		        System.out.println((int)Math.ceil(excess/8.0));
		    }
		}
	}
}
