import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int largestdivisor = 1;
		for(int i=1;i<=10;i++){
		   if(num%i==0){
		       largestdivisor=i;
		   }
		}
		System.out.println(largestdivisor);

	}
}
