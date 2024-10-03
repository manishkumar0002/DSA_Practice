package PrefixArray;

import java.util.Scanner;

public class GoogleGirl_hackthon {
    /*  problem :--->>
    Maximize equal numbers
=====================

You are given the following :
-> An array a consisting of n elemnets
-> Integr k

For each (1<=i<=n) perform the following operation exactly one time :
  > Replace  Ai by Ai+x, where x belong [-k, k] which denotes x should lie in the range of -k and k both inclusive

Task
====
Detrmine the maximum length of the subsequence if array a such that all numbers in that subsequence are eqaul after applying the given operation

notes :--- A subsequence of array a is  am array that can be derived from array a by removing some elemnt from it */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long[] a = new long[(int)(n + 1)];

        long k = scanner.nextLong();

        long i = 1;
        while (i <= n) {
            a[(int)i] = scanner.nextLong();
            i++;
        }

        long[] b = new long[200005];
        i = 1;
        while (i <= n) {
            long l = a[(int)i] - k;
            long r = a[(int)i] + k;
            b[(int)l] = b[(int)l] + 1;
            b[(int)(r + 1)] = b[(int)(r + 1)] - 1;
            i = i + 1;
        }

        long answer = 1;
        i = 1;
        while (i <= 200000) {
            b[(int)i] = b[(int)(i - 1)] + b[(int)i];
            answer = Math.max(b[(int)i], answer);
            i = i + 1;
        }

        System.out.println(answer);
    }

}
