import java.util.Scanner;
import java.util.Stack;

public class A128_강준혁_20230725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean check = true;

            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        check = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        check = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            System.out.println(check && stack.empty() ? "yes" : "no");
        }

        scanner.close();
    }
}
