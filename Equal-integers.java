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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int operations = 0;

            if (x > y) {
                if ((x - y) % 2 == 0) {
                    operations = (x - y) / 2;
                } else {
                    operations = (x - y) / 2 + 2;
                }
            } else {
                operations = y - x;
            }

            System.out.println(operations);
        }
    }
}
