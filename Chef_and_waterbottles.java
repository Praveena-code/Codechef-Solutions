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
		    int available_bottels=sc.nextInt();
		    int per_liter=sc.nextInt();
		    int total_liters=sc.nextInt();
		    int bottles=total_liters/per_liter;
		    System.out.println(Math.min(available_bottels,bottles));
		    
		}

	}
}
