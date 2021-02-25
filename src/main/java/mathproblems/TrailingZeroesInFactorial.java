package mathproblems;

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

    public static void main(String[] args) {
        int input = 4617;
        System.out.println(trailingZeroes(input));
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
