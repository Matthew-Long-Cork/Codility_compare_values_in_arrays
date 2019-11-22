import java.util.Arrays;
//=========================================
// find the smallest positive integer
// that occurs in both arrays
//=========================================
class Solution {
    public static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j < m - 1 && B[j] < A[i])
                j += 1;
            if (A[i] == B[j])
                return A[i];
        }
        return -1;
    }
    //=========================================
    // the main below was just to run for testing purposes
    public static void main(String args[]) {

        // allocating the arrays ... for testing.
        int intArrayA[] = { 2,3000000,3,3,4,3,3,5};
        int intArrayB[] = { 1,1,5000000,4,5};
        //int intArray[] = { };

        //pass in array to function and print the result
        int answer = solution(intArrayA,intArrayB);
        System.out.println("The answer is: " + answer);
    }
}// end of solution

