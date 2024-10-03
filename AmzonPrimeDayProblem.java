package PrefixArray;

import java.util.HashMap;
import java.util.Map;

public class AmzonPrimeDayProblem {
    public static void main(String[] args) {
        int [] arr ={1,5,5,1,1,8,8,10 , 10};
        int minOps=minOperationsToDestroyArray(arr);

        if(minOps== -1){
            System.out.println("it is notn possible to destroy");

        }else {
            System.out.println("minum non of operqation : " +minOps);
        }
    }

    public static int minOperationsToDestroyArray(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int minOperations = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            if (freq == 1) {
                return -1;
            } else {

                minOperations += freq / 3 + (freq % 3 != 0 ? 1 : 0);
            }
        }
        return minOperations;
    }

}
