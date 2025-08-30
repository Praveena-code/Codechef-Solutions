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
		    int num_of_candies = sc.nextInt();
		    int num_of_pockets = sc.nextInt();
		    int a_pocket_can_hold = sc.nextInt();
		    int total=num_of_pockets*a_pocket_can_hold;
		    System.out.println((int)Math.ceil((double)num_of_candies/total));
		    
		}

	}
}
