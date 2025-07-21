import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int coins=sc.nextInt();
            int bills=sc.nextInt();
            int tt=coins*bills;
            int mm=tt/100;
            System.out.println(mm);
        }
	}
}
