import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int area = l*b;
		int peri = 2*(l+b);
		if(area>peri){
		    System.out.println("Area");
		    System.out.println(area);
		}
		else if(area==peri){
		    System.out.println("Eq");
		    System.out.println(area);
		}
		else{
		    System.out.println("Peri");
		    System.out.println(peri);
		}

	}
}
