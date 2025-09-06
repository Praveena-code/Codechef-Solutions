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
		    int sticks = sc.nextInt();
		    int per_plate = sc.nextInt();
		    int rupees = sc.nextInt();
		    int extra_sticks=rupees/30;
		    int total_sticks = sticks+extra_sticks;
		    System.out.println((int)Math.ceil((double)total_sticks/per_plate));
		    
		}

	}
}
