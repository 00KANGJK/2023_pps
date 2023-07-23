import java.util.Arrays;
import java.util.Scanner;

public class A084_강준혁_20230719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = str.substring(i, size);
        }
        Arrays.sort(arr);
        for (String s : arr){
            System.out.println(s);
        }
    }
}