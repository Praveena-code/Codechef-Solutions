import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int chef = sc.nextInt();
            int chefina = sc.nextInt();
            int chefspeed = sc.nextInt();
            int chefinaspeed = sc.nextInt();

            double chefTime = (double)chef / chefspeed;
            double chefinaTime = (double)chefina / chefinaspeed;

            if(chefTime < chefinaTime){
                System.out.println("Chef");
            }
            else if(chefTime == chefinaTime){
                System.out.println("Both");
            }
            else{
                System.out.println("Chefina");
            }
        }

    }
}
