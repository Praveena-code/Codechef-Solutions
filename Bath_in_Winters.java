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
		    int total=sc.nextInt();
		    int litre=sc.nextInt();
		    if(total <(litre*2)){
		        System.out.println("0");
		    }
		    else{
		        System.out.println(total/(litre*2));
		    }
		}

	}
}
