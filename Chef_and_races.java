import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int c_race1 = sc.nextInt();
		    int c_race2 = sc.nextInt();
		    int a_race1 = sc.nextInt();
		    int a_race2 = sc.nextInt();
		    int count=2;
		    if(c_race1==a_race1 || c_race1==a_race2){
		        count--;
		    }
		    if(c_race2==a_race1 || c_race2==a_race2){
		        count--;
		    }
		    System.out.println(count);
		}

	}
}
