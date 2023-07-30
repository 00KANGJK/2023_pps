
import java.util.*;

public class A124_강준혁_20230725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 나눠줄 값 i
        int i = 2;
        // N이 1이 아니라면 반복
        while (N != 1) {
            // 나누어 떨어지면 나눈 값을 출력하고, N을 i로 나눠준다.
            if (N % i == 0) {
                System.out.println(i);
                N /= i;
                // 나누어 떨어지지 않는다면 i +1해준다.
            } else {
                i++;
            }
        }
        scanner.close();
    }
}