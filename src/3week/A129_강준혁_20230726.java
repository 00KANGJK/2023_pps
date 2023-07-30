import java.util.Scanner;

public class A129_강준혁_20230726 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        int T = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = scanner.nextInt();
            sb.append(dp[N]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
