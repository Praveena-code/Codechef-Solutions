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
		    int seconds = sc.nextInt();
		    if(seconds%2==0){
		        System.out.println(seconds);
		    }
		    else{
		        System.out.println(seconds+2);
		    }
		    
		}


	}
}
