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
		    int n=sc.nextInt();
		    int age=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(age<=arr[i]){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
