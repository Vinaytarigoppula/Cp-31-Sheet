import java.util.Scanner;

public class p30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int[] dp=new int[999999+1];
        int oper=0;
        for(int i=1;i<=999999;i++)
        {
            if(helper(i))
            {
                oper++;
            }
            dp[i]=oper;
        }
        while(t-->0)
        {
            int n=sc.nextInt();
            System.out.println(dp[n]);        
        }
    }
    public static boolean helper(int i)
    {
        int notzero=0;
        while(i!=0)
        {
            int k=i%10;
            if(k!=0) notzero++;
            if(notzero>1) return false;
            i/=10;
        }
        return true;
    }
}
