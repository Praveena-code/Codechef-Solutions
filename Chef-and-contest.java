import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int ct=sc.nextInt();
		    int ft=sc.nextInt();
		    int pc=sc.nextInt();
		    int pf=sc.nextInt();
		    int chef_penalty=ct+(pc*10);
		    int chefina_penalty=ft+(pf*10);
		    if(chef_penalty<chefina_penalty){
		        System.out.println("Chef");
		    }
		    else if(chef_penalty==chefina_penalty){
		        System.out.println("Draw");
		    }
		    else{
		        System.out.println("Chefina");
		    }
		}

	}
}
