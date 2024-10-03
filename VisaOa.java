package PrefixArray;

import java.util.Scanner;

public class VisaOa {
    /*
    *
 Prerequisite :->

P0 : You are given an array of size “N”; all elements are 0 in it :)
You are given Q queries :-> [L,R] ; you have to add +1 to all the elements from [L,R]

-> After all queries are performed you have to print the final answer

N = 8
Q = {
1,8
5,8
}

[0 0 0 0 0 0 0 0]

-> [1 1 1 1 1 1 1 1]

-> [1 1 1 1 2 2 2 2]

Brute-Force:->
-> n
-> b[n+1]={0}

-> Q = number of queries!

for(i=1;i<=Q;i++){
    //O(Q)
    Read(L,R)
    for(k=L;k<=R;k++){
        //O(R-L)==> O(N)
        b[k] = b[k] + 1
    }
}


print(b)

TC : O(N*Q)
SC : O(1)

—--------------------------------------------------------------

-> n
-> b[n+1]={0}

-> Q = number of queries!

for(i=1;i<=Q;i++){
    //O(Q)
    Read(L,R)
    b[l] = b[l] + 1
    if(r+1<=n){
    b[r+1] = b[r+1] - 1
    }
}

for(i=1;i<=N;i++){
    //O(N)
    b[i] = b[i] + b[i-1]
}


print(b)

TC - O(N+Q)
SC - O(1)

—-----------------------------------------------------------------------

Visa Problem Solution :->
-> b[100000]={0}

-> Q = number of queries!

for(i=1;i<=Q;i++){
    //O(Q)
    Read(L,R)
    b[l] = b[l] + 1
    if(r+1<=n){
    b[r+1] = b[r+1] - 1
    }
}

for(i=1;i<=N;i++){
    //O(N)
    b[i] = b[i] + b[i-1]
}

p->points.
for(i=1;i<=p;i++){
    read(y)
    print(b[y])
}

TC : O(N+Q+P)
SC : O(1)
IF l,r<=100000
This algorithm works perfectly fine.

    */


    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int Q = scanner.nextInt();
            int p = scanner.nextInt();

            int[] b = new int[100001]; // Assuming l, r <= 100000

            for (int i = 1; i <= Q; i++) {
                int L = scanner.nextInt();
                int R = scanner.nextInt();
                b[L] = b[L] + 1;

                if (R + 1 <= n) {
                    b[R + 1] = b[R + 1] - 1;
                }
            }

            for (int i = 1; i <= n; i++) {
                b[i] = b[i] + b[i - 1];
            }

            for (int i = 1; i <= p; i++) {
                int y = scanner.nextInt();
                System.out.println(b[y]);
            }
        }
    }

}
