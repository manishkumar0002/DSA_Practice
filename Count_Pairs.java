package Hashing;

import java.util.HashMap;

public class Count_Pairs {
    public static void main(String[] args) {
        int [] b ={1,7,5,9,2,12,3};
        int k =2;

        System.out.println("Number of pairs : "+ countPairsBrute(k,b));
       System.out.println("count with differrnce : "+ countPairsWithDifference(b,k));
    }

    private static int countPairsWithDifference(int[] b, int k) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        int count=0;

        for(int j =0; j<b.length; ++j){
            if (freq.containsKey(b[j]-k)){
                count+=freq.get(b[j]);
            }
            if (k != 0 && freq.containsKey(b[j]+k)){
                count += freq.get(b[j] + k);
            }
            freq.put(b[j], freq.getOrDefault(b[j], 0) + 1);
        }
        return count;
    }

    private static int countPairsBrute(int k, int[] b) {
        int count=0;
        int n =b.length;
        for(int i =0 ; i<n ; i++){
            for (int j =i+1; j<n ; j++){
                if(Math.abs(b[i]-b[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
}
