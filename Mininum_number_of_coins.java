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
		    int rupees = sc.nextInt();
		    if(rupees%10==0){
		        System.out.println(rupees/10);
		    }
		    else if(rupees%5==0 && rupees%10!=0){
		        System.out.println((rupees/10)+1);
		    }
		    else{
		        System.out.println("-1");
		    }
		}

	}
}
