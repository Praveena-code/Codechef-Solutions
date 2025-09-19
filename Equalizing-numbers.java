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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a==b || (b-a)%2==0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
		

	}
}
