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
	        int initial_temp=sc.nextInt();
	        int desired_temp=sc.nextInt();
	        int hot_water=sc.nextInt();
	        int cold_water=sc.nextInt();
	        int diff=desired_temp-initial_temp;
	        if(diff>0){
	            if(diff<=hot_water){
	                System.out.println("YES");
	            }
	            else{
	                System.out.println("NO");
	            }
	        }
	        else if(diff<0){
	            if(Math.abs(diff)<=cold_water){
	                 System.out.println("YES");
	            }
	            else{
	                System.out.println("NO");
	            }
	        }
	        else {
	            System.out.println("YES");
	        }
	    }

	}
}
