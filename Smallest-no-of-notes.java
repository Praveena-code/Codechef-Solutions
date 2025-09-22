import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-->0){
		    int amount = sc.nextInt();
		        int h = amount%100;
		        int f = h%50;
		        int t = f%10;
		        int five = t%5;
		        int two = five%2;
		    System.out.println((amount/100)+(h/50)+(f/10)+(t/5)+(five/2)+two);
		}

	}
}
