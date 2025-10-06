import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    if(n%4==1)
		    System.out.println("East");
		    else if(n%4==2)
		    System.out.println("South");
		    else if(n%4==3)
		    System.out.println("West");
		    else
		    System.out.println("North");
		}

	}
}
