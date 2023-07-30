import java.util.Scanner;
import java.util.Arrays;

public class A030_강준혁_20230727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double M = sc.nextDouble();

        sc.nextLine(); // Clear newline character

        double[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        M = (1 - M) * 1000;

        for (int i = 0; i < N; ++i) {
            M = M * arr[0] + (1000 - M) * arr[2];
        }

        System.out.println(String.format("%.0f", M));
        System.out.println(String.format("%.0f", 1000 - M));
    }
}
