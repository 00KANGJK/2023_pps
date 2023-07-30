import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the integer array: ");
        int length = in.nextInt();
        int[] digits = new int[length];
        System.out.print("Enter the digits of the large integer: ");
        for (int i = 0; i < length; i++) {
            digits[i] = in.nextInt();
        }

        Solution solution = new Solution();

        int[] result = solution.plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result));
        in.close();
    }
}
