import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int x3=sc.nextInt();
		    int v1=sc.nextInt();
		    int v2=sc.nextInt();
		    double chef=(double)Math.abs(x3-x1)/v1;
            double kefa=(double)Math.abs(x3-x2)/v2;
		    if(chef<kefa){
		        System.out.println("Chef");
		    }
		    else if(chef==kefa){
		        System.out.println("Draw");
		    }
		    else{
		        System.out.println("Kefa");
		    }
		}

	}
}
