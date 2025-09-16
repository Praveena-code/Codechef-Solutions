import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int maxlead = 0;
		int winner = 0;
		int player1score = 0;
		int player2score = 0;
		while(t-->0){
		    int score1 = sc.nextInt();
		    int score2 = sc.nextInt();
		    
		    player1score+=score1;
		    player2score+=score2;
		    
		    int lead = player1score - player2score;
		    int abslead = Math.abs(lead);
		    
		    if(abslead > maxlead){
		        maxlead = abslead;
		        winner = (lead > 0) ? 1 : 2;
		    }
		}
		System.out.println(winner + " " + maxlead);

	}
}
