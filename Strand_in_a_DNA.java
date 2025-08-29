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
		    String str=sc.next();
		    StringBuilder result=new StringBuilder();
		    for(int i=0;i<n;i++){
		    char ch=str.charAt(i);
		    if(ch=='A') {
		            result.append('T');
		    }
		    else if(ch=='T') {
		            result.append('A');
		    }
		    else if(ch=='G') {
		            result.append('C');
		    }
		    else if(ch=='C') {
		            result.append('G');
		    }
		    
		}
		System.out.println(result.toString());

	}
}
}
