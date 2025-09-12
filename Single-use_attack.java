import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int attack_needed = sc.nextInt();
		    int each_time = sc.nextInt();
		    int special_attack = sc.nextInt();
		    int use_special_attack=attack_needed-special_attack;
		    System.out.println(((int)Math.ceil((double)use_special_attack/each_time))+1);
		}

	}
}
