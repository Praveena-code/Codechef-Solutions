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
		    int episodes=sc.nextInt();
		    int even_episodes=sc.nextInt();
		    int odd_episodes=sc.nextInt();
		    int odd=(episodes+1)/2;
		    int even=episodes/2;
		    System.out.println((odd*odd_episodes)+(even*even_episodes));
		}

	}
}
