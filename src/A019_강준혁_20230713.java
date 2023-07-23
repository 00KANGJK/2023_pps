import java.util.Scanner;
public class A019_강준혁_20230713 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int num = A*B*C;

        int[] arr = new int[10];

        while (num != 0) {
            arr[num%10]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
