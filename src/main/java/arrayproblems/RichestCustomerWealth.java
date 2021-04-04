package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith​customer has in the jth bank.
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
*/
public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = -1;
        for (int[] account : accounts) {
            int curr = 0;
            for (int i : account) {
                curr += i;
            }
            maxWealth = Math.max(curr, maxWealth);
        }
        return maxWealth;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(6, maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(10, maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
    }
}
