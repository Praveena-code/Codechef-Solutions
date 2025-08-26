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
		    int seat_no=sc.nextInt();
		    if(seat_no<=10){
		        System.out.println("Lower Double");
		    }
	    else if(seat_no>=16 && seat_no<=25){
	            System.out.println("Upper Double");
		}
        else if(seat_no>=11 && seat_no<=15){
            System.out.println("Lower Single");
        }
        else if(seat_no>=26 && seat_no<=30){
            System.out.println("Upper Single");
        }
        else{
            System.out.println("No seats");
        }
	}
}
}
