import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int D = sc.nextInt();

            if (Math.abs(X - Y) <= D) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

	}
}
