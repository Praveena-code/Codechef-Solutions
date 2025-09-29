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
		    if(num<7 && num%2!=0){
		            System.out.println("NO");
		        }
		        else{
		            System.out.println("YES");
		    }
		}
	}
}
