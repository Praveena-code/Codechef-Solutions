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
		    int exam_starts = sc.nextInt();
		    int episodes = sc.nextInt();
		    int each_episode = sc.nextInt();
		    int total_episode_time = episodes*each_episode;
		    if(total_episode_time<exam_starts){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
