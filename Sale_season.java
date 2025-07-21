import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n<=100){
                System.out.println(n);
            }
            else if(n>100 && n<=1000){
                int m=n-25;
                System.out.println(m);
            }
            else if(n>1000 && n<=5000){
                int y=n-100;
                System.out.println(y);
            }
            else{
                int j=n-500;
                System.out.println(j);
            }
        }
	}
}
