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
		    int chef_room = sc.nextInt();
		    int chefina_room = sc.nextInt();
		    int chef = (int)Math.ceil((double)chef_room/10.0);
		    int chefina = (int)Math.ceil((double)chefina_room/10.0);
		    System.out.println(Math.abs(chef-chefina));
		}

	}
}
