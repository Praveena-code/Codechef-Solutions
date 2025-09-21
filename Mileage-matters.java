import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    double distance = sc.nextDouble();
		    double petrol_price_per = sc.nextDouble();
		    double diesel_price_per = sc.nextDouble();
		    double petrol_per_distance = sc.nextDouble();
		    double diesel_per_distance = sc.nextDouble();
		    double petrol = distance/petrol_per_distance;
		    double tot_petrol = petrol*petrol_price_per;
		    double diesel = distance/diesel_per_distance;
		    double tot_diesel = diesel*diesel_price_per;
		    if(tot_petrol<tot_diesel){
		        System.out.println("PETROL");
		    }
		    else if(tot_petrol==tot_diesel){
		        System.out.println("ANY");
		    }
		    else{
		        System.out.println("DIESEL");
		    }
		}
	}
}
