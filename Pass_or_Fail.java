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
		    int total_questions = sc.nextInt();
		    int correct = sc.nextInt();
		    int pass_mark = sc.nextInt();
		    int fail_ques = total_questions-correct;
		    int current_marks = correct*3;
		    int marks_he_has_currently = current_marks-fail_ques;
		    if(marks_he_has_currently>=pass_mark){
		        System.out.println("PASS");
		    }
		    else{
		        System.out.println("FAIL");
		    }
		}
		

	}
}
