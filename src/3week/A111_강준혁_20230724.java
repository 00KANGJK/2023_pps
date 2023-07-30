import java.util.Scanner;

public class A111_강준혁_20230724 {
    private static final int MAX_N = 30;
    private static int[] result = new int[MAX_N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < MAX_N; i++) {
            result[i] = recursion(i + 1);
        }

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if (k == 1) {
                System.out.print(1);
            } else {
                System.out.print(result[k - 1]);
            }
            if (i != n - 1) {
                System.out.println();
            }
        }
        scanner.close();
    }

    private static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (int) ((recursion(n - 1) + 0.5) * 2);
        }
    }
}
