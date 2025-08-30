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
	        int first_num=sc.nextInt();
	        int second_num=sc.nextInt();
	        int onetwosum=21-(first_num+second_num);
	        if(onetwosum>=1 && onetwosum<=10){
	            System.out.println(onetwosum);
	        }
	        else{
	            System.out.println(-1);
	        }
	        
	    }
	}
}
