import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    char f=sc.next().charAt(0);
		    char s=sc.next().charAt(0);
		    char th=sc.next().charAt(0);
		    char a=sc.next().charAt(0);
		    char b=sc.next().charAt(0);
		    if(f==a||f==b){
		        System.out.println(f);
		    }
		    else{
		        System.out.println(s);
		    }
		    
		}

	}
}
