package arrayproblems;

public class MissingNumber {
    /*
    Given an array of size N-1 such that it can only contain distinct integers in the range of 1 to N.
    Find the missing element.
    N = 5
    A[] = {1,2,3,5}
    Output: 4
    */

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int n = input.length + 1;
        int missingNumber = missingNumberInArray(input, n);
        System.out.println(missingNumber);
    }

    private static int missingNumberInArray(int[] input, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int currentSum = 0;

        for (int i : input) {
            currentSum += i;
        }

        return totalSum - currentSum;
    }
}
