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
		    int target=sc.nextInt();
		    int jump=sc.nextInt();
		    int bigjump=target/jump;
		    int eachstep=target%jump;
		    System.out.println(bigjump+eachstep);
		    
		}

	}
}
