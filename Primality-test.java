import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int num = sc.nextInt();
		    if(isPrime(num)){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
	public static boolean isPrime(int num){
	    if(num<=1){
	        return false;
	    }
	    for(int i=2;i<=Math.sqrt(num);i++){
	        if(num%i==0){
	            return false;
	        }
	    }
	    return true;
	}
}
