import java.util.Arrays;
import java.util.Scanner;

public class A125_강준혁_20230725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weight = new int[N];

        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }

        Arrays.sort(weight);

        int maxWeight = getMaxWeight(N, weight);
        System.out.println(maxWeight);
    }

    private static int getMaxWeight(int n, int[] weight) {
        int max = weight[0] * n;

        for (int i = 1; i < n; i++) {
            int currentWeight = weight[i] * (n - i);
            max = Math.max(max, currentWeight);
        }

        return max;
    }
}
