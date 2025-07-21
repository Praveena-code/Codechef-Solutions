import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count1=0,count2=0;
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int o=sc.nextInt();
            int c=m+n+o;
            if(c<=1){
                System.out.println("Water filling time");
            }
            else{
                System.out.println("Not now");
            }
        }
	}
}
