import java.util.Scanner;

public class A031_강준혁_20230727 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = (n-1) + n * (m-1);
        System.out.println(result);
    }
}
