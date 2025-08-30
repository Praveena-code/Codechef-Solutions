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
		    int candies=sc.nextInt();
		    int friends=sc.nextInt();
		    int each_of_them=candies/friends;
		    if(each_of_them%2==0 && candies%friends==0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
