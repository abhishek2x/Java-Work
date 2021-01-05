// QUESTION:

// Binary Number Pattern

// 10101
// 01010
// 10101
// 01010
// 10101

// Observations and Explanation: 

The given question is an application of nested loops
There are two loops: 

-> here we are assigning 1's and 0's based in value of i and j.
-> We note that, when (i+j) is odd, we take 0 at that index.
-> We note that, when (i+j) is even, we take 1 at that index.


// Workflow:
i = 0 to n
j = 0 to n

// PROGRAM:

public class Binary {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j)%2 == 0)
                    System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}

// OUTPUT:

10101
01010
10101
01010
10101

// WORKING: 

i -> row
j -> column

// Sum of positions: 

0 1 2 3 4 
1 2 3 4 5
2 3 4 5 6 
3 4 5 6 7
4 5 6 7 8 

even odd even odd even
odd even odd even odd
even odd even odd even
odd even odd even odd
even odd even odd even 

EVEN -> 1
ODD -> 0

1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1