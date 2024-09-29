package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// problem is this a valid pair of differrence
// Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j]
public class diff_pair {

    public static void main(String[] args) {
        int[] b = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println("count pairs : " + countPairsBruteForce(b, k));
        System.out.println("count pairs of optimal : " + countPairsOptimal(b,k));
    }

    private static int countPairsOptimal(int[] b, int k) {

        // Time Complexity:- O(N)
        //Space Complexity:- O(N)
        int count =0;
        Map<Integer, Integer> freqMap=new HashMap<>();
        for(int j =0; j<b.length; j++){
            int target=b[j]+k;
            if(freqMap.containsKey(target)){
                count+=freqMap.get(target);
            }
            freqMap.put(b[j],freqMap.getOrDefault(b[j],0)+1);
        }
        return count;
    }

    // here the below are in a brute force approach
    private static int countPairsBruteForce(int[] b, int k) {
//
       // Time Complexity:- O(N^2)
     //   Space Complexity:- O(1)

        int count = 0;
        int n = b.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               if (b[i]-b[j]==k){
                   count++;
               }
            }
        }
        return count;
    }


}
