
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n=sc.nextInt();
            sc.nextLine();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            List<Integer> nums=new ArrayList<>();
            nums.add(arr[0]);
            for(int i=1;i<n;i++)
            {
                if(arr[i]<arr[i-1])
                {
                    nums.add(arr[i]);
                    nums.add(arr[i]);
                }
                else nums.add(arr[i]);
            }
            System.out.println(nums.size());
            for(int i:nums)
            {
                System.out.print(i+" ");
            }
        }
    }
}
