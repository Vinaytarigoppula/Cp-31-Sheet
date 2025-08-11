
import java.util.Scanner;

public class p24
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int xor=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                xor^=arr[i];
            }
            if(n%2==1)
            {
                System.out.println(xor);
            }
            else
            {
                if(xor==0) System.out.println(xor);
                else System.out.println(-1);
            }
        }
    }
}