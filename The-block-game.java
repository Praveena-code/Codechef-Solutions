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
		    int num = sc.nextInt();
		    int rev =0;
		    int originalnum=num;
		    while(num>0){
		    int digit = num%10;
		    rev=rev*10+digit;
		    num/=10;
		    }
		    if(originalnum==rev){
		        System.out.println("wins");
		        }
		    else{
		        System.out.println("loses");
		        }
		        
		}

	}
}
