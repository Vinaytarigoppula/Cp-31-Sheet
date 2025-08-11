
import java.util.*;

//problem link : https://codeforces.com/problemset/problem/1777/A
public class p29 {
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
            int oper=0;
            for(int i=0;i<n-1;i++)
            {
                if((arr[i]%2==0 && arr[i+1]%2==0) || (arr[i]%2!=0 && arr[i+1]%2!=0))
                {
                    oper++;
                }
            }
            System.out.println(oper);
        }        
    }  
}
