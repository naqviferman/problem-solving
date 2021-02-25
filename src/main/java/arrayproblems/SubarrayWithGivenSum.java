package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSum {
    /*
    Given an unsorted array A of size N that contains only non-negative integers,
    find a continuous sub-array which adds to a given number S.
    The two indexes in the output list should be according to 1-based indexing.
    Input:
    N = 5, S = 12
    A[] = {1,2,3,7,5}
    Output: 2 4
    */
    public static void main(String[] args) {
        int n = 42;
        int s = 468;
        int[] input = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
//        int n = 5;
//        int s = 12;
//        int[] input = {1,2,3,7,5};
//        int n = 10;
//        int s = 15;
//        int[] input = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> result = subarraySum(input, n, s);
        System.out.println(result);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int i = 0;
        int j = 0;
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (true) {
            if (sum < s) {
                sum += arr[i];
                i++;
            } else if (sum > s) {
                sum -= arr[j];
                j++;
            }

            if (i == n && sum < s)
                break;

            if (j == n && sum > s)
                break;

            if (sum == s) {
                result.addAll(Arrays.asList(j + 1, i));
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
