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
		    int tt=sc.nextInt();
		    int one=sc.nextInt();
		    int two=sc.nextInt();
		    if((one*1)+(two*2)>=tt){
		        System.out.println("Qualify");
		    }
		    else{
		        System.out.println("NotQualify");
		    }
		}

	}
}
