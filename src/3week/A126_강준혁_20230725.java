import java.util.Scanner;

public class A126_강준혁_20230725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(numberCount(N));
    }

    private static int numberCount(int N) {
        int count;

        if (N < 100) {
            return N;
        } else {
            count = 99;

            for (int i = 100; i <= N; i++) {
                int A = i / 100;
                int B = (i / 10) % 10;
                int C = i % 10;

                if (B - A == C - B) {
                    count++;
                }
            }
        }
        return count;
    }
}
