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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int m=a+c;
		    int n=b+c;
		    int o=a+d;
		    int p=b+d;
		    if(m>=n && m>=o && m>=p){
		        System.out.println(m);
		    }
		    else if(n>=m && n>=o && n>=p){
		        System.out.println(n);
		    }
		    else if(o>=n && o>=m && o>=p){
		        System.out.println(o);
		    }
		    else if(p>=n && p>=o && p>=m){
		        System.out.println(p);
		    }
		}

	}
}
