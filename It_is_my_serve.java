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
		    int score1=sc.nextInt();
		    int score2=sc.nextInt();
		    int totalPoints = score1 + score2;
            int serveTurn = totalPoints / 2;
		    if (serveTurn % 2 == 0)
                System.out.println("Alice");
            else
                System.out.println("Bob");
		}

	}
}
