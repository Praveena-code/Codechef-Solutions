import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-->0){
		    int hardness = sc.nextInt();
		    double carbon = sc.nextDouble();
		    int tensile = sc.nextInt();
		    int h =50;
		    double c =0.7;
		    int t = 5600;
		    if(hardness>h && carbon<c && tensile>t){
		        System.out.println("10");
		    }
		    else if(hardness>h && carbon<c){
		        System.out.println("9");
		    }
		    else if(tensile>t && carbon<c){
		        System.out.println("8");
		    }
		    else if(hardness>h && tensile>t){
		        System.out.println("7");
		    }
		    else if(hardness>h || carbon<c || tensile>t){
		        System.out.println("6");
		    }
		    else{
		        System.out.println("5");
		    }
		}

	}
}
