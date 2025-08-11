//link: https://codeforces.com/problemset/problem/1791/C
import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int l=0,r=n-1;
            while(l<r)
            {
                if((s.charAt(l)=='0' && s.charAt(r)=='1')  || (s.charAt(l)=='1' && s.charAt(r)=='0')) 
                {
                    l++;
                    r--;
                }      
                else break;    
            }
            System.out.println(r-l+1);
        }
    }   
}
