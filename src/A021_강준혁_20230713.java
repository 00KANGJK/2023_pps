import java.util.Scanner;

public class A021_강준혁_20230713 {
    public static void main(String[] args)  {
        Scanner br = new Scanner(System.in);
        int n = Integer.parseInt(br.nextLine());
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(br.nextLine());
        }
        total -= (n-1);
        System.out.print(total);
    }
}
