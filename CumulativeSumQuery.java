package PrefixArray;

import java.util.Scanner;

public class CumulativeSumQuery {
     // problem statement :->
     //William Macfarlane wants to look at an array.You are given a list of N numbers and Q queries.
    // Each query is specified by two numbers i and j; the answer to each query is the sum of every number
    // between the range [i, j] (inclusive).
    //Note: the query ranges are specified using 0-based indexing.

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr =new int[n];
        int [] prefixArray=new int[n];

        int sum=0;
        for (int i =0; i<n ; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            prefixArray[i]=sum;

        }
        int q = sc.nextInt();
        while (q > 0){
            int l =sc.nextInt();
            int r =sc.nextInt();
            int right =prefixArray[r-1];
            int left =1==1?0:prefixArray[l-2];

            System.out.println(right- left);
            q--;
        }
    }
}
