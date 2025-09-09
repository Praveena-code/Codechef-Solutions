import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int team_a_score = sc.nextInt();
		int overs_over = sc.nextInt();
		int team_b_score = sc.nextInt();
		int remaining_over = 20-overs_over;
		int total = (remaining_over*6)*6;
		int valid = team_b_score+total;
		if(valid>team_a_score){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		

	}
}
