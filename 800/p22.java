//problem link : https://codeforces.com/problemset/problem/1814/A
import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n % k == 0) {
                System.out.println("YES");
            } else if (n % 2 == 0) {
                System.out.println("YES");
            } else {
                if (k % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
