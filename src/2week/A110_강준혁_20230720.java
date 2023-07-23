import java.util.Scanner;

public class A110_강준혁_20230720 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int[] coin = {500, 100, 50, 10, 5, 1};
        int change = 1000 - sc.nextInt();
        int index = 0;
        int answer = 0;

        while(change != 0) {
            int temp = change / coin[index];

            change -= temp * coin[index++];

            answer += temp;
        }

        System.out.println(answer);

    }

}