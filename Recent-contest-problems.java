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
		    int count1=0,count2=0;
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++){
		        String str=sc.next();
		        if(str.charAt(0)=='S'){
		        count1++;
		    }
		    else if(str.charAt(0)=='L'){
		        count2++;
		    }
		    }
		    System.out.println(count1+" "+count2);
		}

	}
}
