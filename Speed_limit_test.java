import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    double a = sc.nextDouble();
		    double x = sc.nextDouble();
		    double b = sc.nextDouble();
		    double y = sc.nextDouble();
		    if((a/x)>(b/y)){
		        System.out.println("Alice");
		    }
		    else if((a/x)<(b/y)){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Equal");
		    }
		    
		    
		}

	}
}
