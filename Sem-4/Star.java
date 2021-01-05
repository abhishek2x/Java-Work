// Explanation: 

// The given question is an application of nested loops
// There are two loops: 
// Outer i runs for rows and inner j loop runs for columns

// Workflow:
// i = 0 to 5
// j = 0 to i

// PROGRAM:

public class Star {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT:

// *
// * *
// * * *
// * * * *
// * * * * *

// FLOW

// i -> row
// j -> column

// 0 1 2 3 4 5
// 0 *
// 1 * *
// 2 * * *
// 3 * * * *
// 4 * * * * *