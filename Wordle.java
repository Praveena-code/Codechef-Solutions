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
	        StringBuilder str3 = new StringBuilder();
	        String str1 = sc.next();
	        String str2 = sc.next();
	        for(int i=0;i<str1.length();i++){
	            if(str1.charAt(i)==str2.charAt(i)){
	                str3.append("G");
	            }
	            else{
	                str3.append("B");
	            }
	        }
	        System.out.println(str3.toString());
	    }

	}
}
