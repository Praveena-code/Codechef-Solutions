import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		int count1=0;
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int m=n%2;
		    if(m==0){
		        count+=1;
		    }
		    else {
		        count1+=1;
		    }
		    
		}
		if(count>count1){
		    System.out.println("READY FOR BATTLE");
		}
		else{
		    System.out.println("NOT READY");
		}

	}
}
