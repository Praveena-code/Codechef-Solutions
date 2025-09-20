import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		char parent1=sc.next().charAt(0);
		char parent2=sc.next().charAt(0);
		if(parent1==parent2){
		    System.out.println(parent1);
		}
		else if(parent1=='R' || parent2=='R'){
		    System.out.println('R');
		}
		else if(parent1=='B' || parent2=='B'){
		    System.out.println('B');
		}
		else{
		    System.out.println('G');
		}

	}
}
