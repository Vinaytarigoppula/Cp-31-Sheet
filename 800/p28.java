
import java.util.*;

//link : https://codeforces.com/problemset/problem/1783/A
public class p28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            sc.nextLine();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int maxi=arr[n-1];
            int mini=arr[0];
            if(maxi==mini)
            {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.print(maxi+" ");
            for(int i=0;i<n-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
    }
}
