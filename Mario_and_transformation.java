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
		    int n=sc.nextInt();
		    if(n%3==2){
		        System.out.println("SMALL");
		    }
		    else if(n%3==1){
		        System.out.println("HUGE");
		    }
		    else if(n%3==0){
		        System.out.println("NORMAL");
		    }
		}

	}
}
