import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int petrol = sc.nextInt();
		    int diesel = sc.nextInt();
		    int p = sc.nextInt();
		    int d = sc.nextInt();
		    double car1=(double)p/petrol;
		    double car2=(double)d/diesel;
		    if(car1<car2){
		        System.out.println("-1");
		    }
		    else if(car1==car2){
		        System.out.println("0");
		    }
		    else{
		        System.out.println("1");
		    }
		}

	}
}
