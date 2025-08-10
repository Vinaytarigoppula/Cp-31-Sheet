//problem link:https://codeforces.com/problemset/problem/1837/A
import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n%x!=0)
            {
                System.out.println(1);
                System.out.println(n);
                continue;
            }
            for(int i=n-1;i>=0;i++)
            {
                int diff=n-i;
                if(i%x!=0 && diff%x!=0)
                {
                    System.out.println(2);
                    System.out.println(i+" "+diff);
                    break;
                }
            }
        }
        sc.close();
    }
}
