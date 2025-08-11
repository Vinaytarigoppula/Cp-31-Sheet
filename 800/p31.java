//link :https://codeforces.com/problemset/problem/1761/A
import java.util.Scanner;

public class p31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((a+b+2<=n) || (a==b && b==n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
