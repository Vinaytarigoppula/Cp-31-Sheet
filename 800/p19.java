//problem link : https://codeforces.com/problemset/problem/1834/A


import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            sc.nextLine();
            int[] arr=new int[n];
            int ones=0,minus=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]>0) ones++;
                else minus++; 
            }
            int operations = 0;

            // Make sum >= 0
            while (minus > ones) {
                minus--;
                ones++;
                operations++;
            }

            // Make product = 1 (even number of -1's)
            if (minus % 2 != 0) {
                operations++;
                minus--;
                ones++;
            }

            System.out.println(operations);
        }
    }
    
}
