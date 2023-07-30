import java.util.Scanner;
import java.util.Stack;

public class A130_강준혁_20230726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                sum -= stack.pop();
            } else {
                stack.push(x);
                sum += x;
            }
        }

        System.out.println(sum);
    }
}
