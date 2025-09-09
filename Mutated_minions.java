import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int trans_char = sc.nextInt();
		    int count=0;
		    for(int i=0;i<n;i++){
		        int nums = sc.nextInt();
		        int after_trans=nums+trans_char;
		        if(after_trans%7==0){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
