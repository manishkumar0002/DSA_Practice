package Hashing;

import java.util.Scanner;

public class subarray_sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr=new int[n];
        for (int i =1; i<=n ; i++){
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        int count=0;
        for (int j =1; j <=n; j++){
            int currentsum=0;
            for (int i=j ; i>=1;i--){
                currentsum+=arr[i];
                if (currentsum==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
