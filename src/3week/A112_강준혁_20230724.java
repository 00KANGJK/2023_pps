import java.util.Arrays;
import java.util.Scanner;

public class A112_강준혁_20230724 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] bundle = new int[M];
        int[] single = new int[M];

        for(int i = 0; i < M; i++) {
            bundle[i] = scanner.nextInt();
            single[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(bundle);
        Arrays.sort(single);

        int minBundle = bundle[0];
        for(int s : single) {
            if(minBundle > (s * 6))
                minBundle = s * 6;
        }

        int pack = (N / 6 + 1) * minBundle;
        int sing = (N / 6) * minBundle + (N % 6) * single[0];
        System.out.println(pack < sing ? pack : sing);
    }
}
