import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int levels_remain = sc.nextInt();
            int each_level_time = sc.nextInt();
            int break_time = sc.nextInt();

            int total_time = levels_remain * each_level_time;
            int breaks = levels_remain / 3;

            if (levels_remain % 3 == 0) {
                breaks -= 1;
            }

            System.out.println(total_time + (breaks * break_time));
        }
    }
}
