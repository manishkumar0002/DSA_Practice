package PrefixArray;

import java.util.HashMap;
import java.util.Scanner;

public class AmazonOA {
    // problem :-
    /*Amazon engineering maintains a large numvber of logs of operations across all products
    A software enginners is debigginmg an issue ina product An efficent way to analyze logs is ton write
     automated scripts to check for patterns  The enginner wants to find a maximummnuber of times a target
      words can be obtained by a reaaranging a subsets of a charcater in a log entry
given a log entry s and target word t , the target words can be obtained by slection some subset  of a
charcater for, s that can be rearranged to form  string  t and removing them from s .
    Determine the maximum number of times the target word can be re oved from the given log entry


    Note : Both String s and t consist only lowercase english letters.

         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String t = scanner.next();

        HashMap<Character, Long> mp1 = new HashMap<>();
        HashMap<Character, Long> mp2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mp1.put(c, mp1.getOrDefault(c, 0L) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mp2.put(c, mp2.getOrDefault(c, 0L) + 1);
        }

        long cnt = (long) 1e9;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!mp1.containsKey(c)) {
                System.out.println(0);
                return;
            }

            long val = mp1.get(c) / mp2.get(c);
            cnt = Math.min(cnt, val);
        }

        System.out.println(cnt);
    }


}
