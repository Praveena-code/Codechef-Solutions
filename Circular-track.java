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
		    int from = sc.nextInt();
		    int to = sc.nextInt();
		    int total_checkpoints = sc.nextInt();
		    int diff = Math.abs(from - to);
		    int direct_path = diff;
		    int other_path = total_checkpoints - diff;
		    System.out.println(Math.min(direct_path, other_path));
		}

	}
}
