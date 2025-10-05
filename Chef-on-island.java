import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int f = sc.nextInt();
		    int w = sc.nextInt();
		    int fs = sc.nextInt();
		    int ws = sc.nextInt();
		    int d = sc.nextInt();
		    double food_supply=(double)f/fs;
		    double water_supply=(double)w/ws;
		    double min=Math.min(food_supply,water_supply);
		    if(min>=d){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
