import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int tt=sc.nextInt();
		int fast=sc.nextInt();
		int speed=fast/2;
		int usual=tt-fast;
		int totalspeed=speed+usual;
		System.out.println(totalspeed);

	}
}
