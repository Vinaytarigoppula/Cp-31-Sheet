//link : https://codeforces.com/problemset/problem/1788/A
import java.util.*;

public class p27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int total=0,curr=0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==2) total++;
            }
            int ans=-1;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==2) curr++;
                if(curr==total-curr)
                {
                    ans=i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
