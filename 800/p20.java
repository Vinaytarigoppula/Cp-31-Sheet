//problem link : https://codeforces.com/problemset/problem/1831/A

import java.util.Scanner;

public class p20 {
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
            for(int i=0;i<n;i++)
            {
                System.out.print(((n+1)-arr[i])+" ");
            }
            System.out.println();
        }
    }
}
