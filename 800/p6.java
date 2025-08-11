//link :https://codeforces.com/problemset/problem/1890/A
import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n=sc.nextInt();
            sc.nextLine();
            int[] arr=new int[n];
            HashMap<Integer,Integer> mpp=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            }
            if(mpp.size()>2)
            {
                System.out.println("NO");
                continue;
            }
             Iterator<Integer> it = mpp.values().iterator();
            if(mpp.size()==1)
            {
                System.out.println("YES");
                continue;

            }
            int first=it.next();
            int last=it.next();
            if(first==last)
            {
                System.out.println("YES");
            }
            else if((n%2!=0) && (Math.abs(first-last))==1)
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        


        }
    }
}
