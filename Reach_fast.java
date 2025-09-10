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
	        int chef = sc.nextInt();
	        int chefina = sc.nextInt();
	        int each_step = sc.nextInt();
	        int steps_needed = Math.abs(chef-chefina);
	        if(steps_needed==0){
	            System.out.println(0);
	        }
	        else{
	        System.out.println((int)Math.ceil((double)steps_needed/each_step));
	        }
	    }

	}
}
