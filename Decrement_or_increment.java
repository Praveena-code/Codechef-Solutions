import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int num = sc.nextInt();
		if(num%4==0){
		    System.out.println(num+1);
		}
		else{
		    System.out.println(num-1);
		}

	}
}
