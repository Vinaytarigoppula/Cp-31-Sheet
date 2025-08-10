
import java.util.Scanner;


public class p21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int maxi=0,zero=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    zero++;
                    maxi=Math.max(maxi,zero);
                }
                else zero=0;
            }
            System.out.println(maxi);
        }
    }
}
