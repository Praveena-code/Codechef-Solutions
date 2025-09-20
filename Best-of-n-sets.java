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
		    int sonu = sc.nextInt();
		    int titu = sc.nextInt();
		    if(sonu<titu){
		    while(sonu<(titu-1)){
		        sonu+=1;
		    }
		    System.out.println(sonu+titu);
		    }
		    else{
		        System.out.println(sonu+(sonu-1));
		    }
		}

	}
}
