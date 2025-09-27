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
		    int total = sc.nextInt();
		    int spent = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int left=total-spent;
		    int needed = a+b+c;
		    if(left>=needed){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
		}

	}
}
