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
            int rev=0;
            while(n>0){
            int m=n%10;
            rev=rev*10+m;
            n=n/10;
            }
            System.out.println(rev);
        }
        

	}
}
