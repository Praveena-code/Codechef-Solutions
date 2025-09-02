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
		    int airlines_available=sc.nextInt();
		    int passengers=sc.nextInt();
		    if(passengers%100==0 && airlines_available*100 <= passengers){
		        int needed=(passengers/100);
		        int need=airlines_available-needed;
		        System.out.println(Math.abs(need));
		    }
		    else if(airlines_available*100 <= passengers && passengers%100!=0){
		        int needed=(passengers/100)+1;
		        int need=airlines_available-needed;
		        System.out.println(Math.abs(need));
		    }
		    else{
		        System.out.println("0");
		    }
		}

	}
}
