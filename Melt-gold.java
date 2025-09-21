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
		    int melting_point = sc.nextInt();
		    int initial_temp = sc.nextInt();
		    int i=1;
		    while(melting_point>initial_temp){
		        initial_temp+=i;
		        i++;
		    }
		    System.out.println(i-1);
		}

	}
}
