import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int total_weight=sc.nextInt();
		    int poss1=sc.nextInt();
		    int poss2=sc.nextInt();
		    int poss3=sc.nextInt();
		    if(total_weight==poss1+poss2 || total_weight==poss3+poss2 || total_weight==poss1+poss3 || total_weight==poss3 || total_weight==poss1 || total_weight== poss2){
		        System.out.println("YES");
		    }
		    else if(total_weight==poss2+poss1+poss3){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
