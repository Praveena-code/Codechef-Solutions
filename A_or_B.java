import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int a_b = ((500-(a*2))+(1000-((a+b)*4)));
		    int b_a = ((1000-(b*4))+(500-((a+b)*2)));
		    if(a_b>=b_a){
		        System.out.println(a_b);
		    }
		    else{
		        System.out.println(b_a);
		    }
		}

	}
}
