import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int arr1[] = new int[3];
		    int arr2[] = new int[3];
		    for(int i=0;i<arr1.length;i++){
		        arr1[i] = sc.nextInt();
		    }
		    for(int i=0;i<arr2.length;i++){
		        arr2[i] = sc.nextInt();
		    }
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    if(arr1[1]+arr1[2]>arr2[1]+arr2[2]){
		        System.out.println("Alice");
		    }
		    else if (arr1[1]+arr1[2]==arr2[1]+arr2[2]){
		        System.out.println("Tie");
		    }
		    else{
		        System.out.println("Bob");
		    }
		}
	}
}
