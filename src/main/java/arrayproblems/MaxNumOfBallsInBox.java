package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1),
and an infinite number of boxes numbered from 1 to infinity.
Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. For example,
the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.
Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.
Input: lowLimit = 1, highLimit = 10
Output: 2
Explanation:
Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
Ball Count:  2 1 1 1 1 1 1 1 1 0  0  ...
Box 1 has the most number of balls with 2 balls.
Input: lowLimit = 5, highLimit = 15
Output: 2
Explanation:
Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
Ball Count:  1 1 1 1 2 2 1 1 1 0  0  ...
Boxes 5 and 6 have the most number of balls with 2 balls in each.
*/
public class MaxNumOfBallsInBox {

    public int countBalls(int lowLimit, int highLimit) {
        int[] boxes = new int[45];

        int n;
        int boxNum;
        int rem;
        int mostBalls = 0;
        while (lowLimit <= highLimit) {
            n = lowLimit;
            boxNum = 0;
            while(n > 0) {
                rem = n % 10;
                boxNum += rem;
                n /= 10;
            }
            boxes[boxNum - 1] += 1;
            mostBalls = Math.max(boxes[boxNum - 1], mostBalls);
            lowLimit++;
        }
        return mostBalls;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(2, countBalls(5 ,15));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2, countBalls(19 ,28));
    }
}
