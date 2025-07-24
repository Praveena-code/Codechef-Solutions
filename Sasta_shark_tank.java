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
	       if(10*a>5*b){
	           System.out.println("FIRST");
	       }
	       else if(10*a<5*b){
	           System.out.println("SECOND");
	       }
	       else if (10*a==5*b){
	           System.out.println("ANY");
	       }
	       
	       
	   }
	}
}
