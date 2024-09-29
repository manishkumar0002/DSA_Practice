package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// problem : We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.
//
//Example Testcase:-
//
//Arr = [3, 2, 3, 2, 4, 3]
//
//Frequencies of Elements of Array are:-
//
//3 - 3
//2 - 2
//4 - 1
public class MaxFreq {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // using a brute approach the time complexites increse
        //
       // Brute Force Approach will work in O(N^2) because of 2 Nested For Loops


       /*  int n =sc.nextInt();
         int [] arr=new int[n];

         //input all the array
         for(int i =0; i<n ; i++){
             arr[i]=sc.nextInt();
         }
         //create a variable to store a frequency of element
        int maxElement=0,maxCount=0,minElement=0,minCount=Integer.MAX_VALUE;

         for (int i =0; i<n ; i++){
             int cnt=0;
             for(int j =0; j<n; j++){
                 if(arr[i]==arr[j]){
                     cnt++;
                 }
             }
             if(maxCount< cnt){
                 maxCount=cnt;
                 maxElement=arr[i];
             }
             if (minCount> cnt){
                 minCount=cnt;
                 minElement=arr[i];
             }
         }
         System.out.println("Max Element :"+maxElement+"   max count is :"+maxCount);
        System.out.println("Min Element :"+minElement+"     min count is: "+minCount);*/


        // then we optimised the above problem using a HashMap

        int n =6;
        int [] arr={1,1,2,3,3,3};

        Map<Integer,Integer> mp=new HashMap<>();
        int maxifreq=Integer.MIN_VALUE, maxiElement=arr[0];
        int minfreq=Integer.MAX_VALUE,minElement=arr[0];

        for(int i =0 ; i< arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }

        for (Map.Entry<Integer,Integer> num : mp.entrySet()){
            if(num.getValue() >=maxifreq){
                maxifreq= num.getValue();
                maxiElement= num.getKey();
            }
            if (num.getValue() <= minfreq){
                minfreq= num.getValue();
                minElement= num.getKey();
            }
        }
        System.out.println("Max frequency element: " + maxiElement + " with frequency: " + maxifreq);
        System.out.println("Min frequency element: " + minElement + " with frequency: " + minfreq);
    }
}
