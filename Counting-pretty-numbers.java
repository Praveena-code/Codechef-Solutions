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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int count=0;
		    while(x<=y){
		       int digit=x%10;
		       if(digit==2||digit==3||digit==9){
		           count++;
		       }
		       x++; 
		    }
		    System.out.println(count);
		}

	}
}
