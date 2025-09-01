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
		    int total_space=sc.nextInt();
		    int app1_space=sc.nextInt();
		    int app2_space=sc.nextInt();
		    int new_app_space=sc.nextInt();
		    int space_available=total_space-(app1_space+app2_space);
		    if(space_available>=new_app_space){
		        System.out.println("0");
		    }
		    else if(total_space-app1_space>=new_app_space || total_space-app2_space>=new_app_space ){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("2");
		    }
		}

	}
}
