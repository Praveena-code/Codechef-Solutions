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
		    int alice = sc.nextInt();
		    int bob = sc.nextInt();
		    int charlie = sc.nextInt();
		    int req=Math.max(alice,charlie);
		    if(req<=bob){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
