package mathproblems;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TrailingZeroesInFactorial {
    /*
    For an integer N find the number of trailing zeroes in N!.
    Input:
    N = 5
    Output:
    1
    Explanation:
    5! = 120 so the number of trailing zero is 1.
    */

//    public static void main(String[] args) {
//        int input = 4617;
//        System.out.println(trailingZeroes(input));
//    }

    @TestFactory
    public Stream<DynamicTest> testTrailingZeroes() {
        int[][] input = new int[][]{{1, 1, 5}, {2, 24, 101}, {3, 249, 1000}, {4, 1151, 4617}};
        return Arrays.stream(input).map(entry -> dynamicTest("Test_" + entry[0], () -> assertEquals(entry[1], trailingZeroes(entry[2]))));
    }

    static int trailingZeroes(int N) {
        int fiveMultiple = 5;
        int zeroesCount = 0;
        int res = N / fiveMultiple;
        while (res > 0) {
            fiveMultiple *= 5;
            zeroesCount += res;
            res = N / fiveMultiple;
        }
        return zeroesCount;
    }
}
