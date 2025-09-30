import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int rating = sc.nextInt();
		    if(rating>=2000){
		        System.out.println("1");
		    }
		    else if(rating>=1600 && rating<2000){
		        System.out.println("2");
		    }
		    else if(rating<1600){
		        System.out.println("3");
		    }
		}

	}
}
