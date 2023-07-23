import java.util.Scanner;
public class A017_강준혁_20230713{
    public static void main(String[] args){
        Scanner br = new Scanner(System.in);
        String s = br.nextLine();
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num == 6) {
                arr[9]++;
            } else {
                arr[num]++;
            }
        }
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max,arr[i]);
        }
        int nine = arr[9]/2;
        if (arr[9]%2==1) nine++;
        max = Math.max(max,nine);
        System.out.print(max);
    }
}
