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
		    int bike=sc.nextInt();
		    int car=sc.nextInt();
		    if(bike<car){
		        System.out.println("BIKE");
		    }
		    else if(car<bike){
		        System.out.println("CAR");
		    }
		    if(bike==car){
		        System.out.println("SAME");
		    }
		}

	}
}
