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
		    int arr[]=new int[4];
		    for(int i=0;i<4;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int sum=0;
		    for(int i=0;i<3;i++){
		        sum+=arr[i];
		    }
		    if(sum<arr[3]){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		
	}
}
