import java.util.Scanner;

public class A029_강준혁_20230726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int first = sc.nextInt();
        sc.close();

        if (N > 5) {
            System.out.println("Love is open door");
        } else {
            int secondMethod = 1 - first; // 2번째 문을 열 방법
            StringBuilder sb = new StringBuilder();

            for (long i = 2; i <= N; i++) {
                if (i % 2 == 0) {
                    sb.append(secondMethod).append("\n");
                } else {
                    sb.append(first).append("\n");
                }
            }

            System.out.print(sb);
        }
    }
}
