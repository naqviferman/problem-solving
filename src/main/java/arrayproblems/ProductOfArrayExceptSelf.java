package arrayproblems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5};
        int[] product = productExceptSelf(input);
        System.out.println(Arrays.toString(product));
        product = productExceptSelfWithoutDivision(input);
        System.out.println(Arrays.toString(product));
        product = productExceptSelfWithoutDivisionMemoryEfficient(input);
        System.out.println(Arrays.toString(product));

        System.out.println("-----------------------------------------");

        input = new int[]{2, 3, 4, 5, 6};
        product = productExceptSelf(input);
        System.out.println(Arrays.toString(product));
        product = productExceptSelfWithoutDivision(input);
        System.out.println(Arrays.toString(product));
        product = productExceptSelfWithoutDivisionMemoryEfficient(input);
        System.out.println(Arrays.toString(product));

    }

    private static int[] productExceptSelfWithoutDivisionMemoryEfficient(int[] input) {
        int length = input.length;

        int[] result = new int[length];
        result[0] = 1;
        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] * input[i - 1];
        }

        int temp = 1;
        for (int i = length - 2; i >= 0; i--) {
            temp *= input[i + 1];
            result[i] *= temp;
        }

        return result;
    }

    private static int[] productExceptSelfWithoutDivision(int[] input) {
        int length = input.length;

        int[] left = new int[length];
        left[0] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = left[i - 1] * input[i - 1];
        }

        int[] right = new int[length];
        right[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * input[i + 1];
        }

        int[] output = new int[input.length];
        for (int i = 0; i < length; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
    }


    private static int[] productExceptSelf(int[] input) {

        int[] output = new int[input.length];
        int product = 1;
        for (int value : input) {
            product *= value;
        }
        for (int i = 0; i < input.length; i++) {
            output[i] = product / input[i];
        }
        return output;
    }
}
