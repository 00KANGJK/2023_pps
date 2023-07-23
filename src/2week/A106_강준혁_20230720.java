import java.util.*;
import java.io.*;

public class A106_강준혁_20230720 {
    private static final int MAX_SIZE = 100;
    private static final int INF = Integer.MAX_VALUE;
    private static final String CENDL = "\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 'A'; i <= 'Z'; i++) {
            sum += i;
        }

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int cand = sum;
            String s = br.readLine();

            // 입력 받은 문자열에서 중복 요소를 제거한다.
            String[] strArr = s.split("");
            Set<String> uniqueSet = new HashSet<>(Arrays.asList(strArr));
            s = String.join("", uniqueSet);

            int size = s.length();
            for (int i = 0; i < size; i++) {
                cand = cand - s.charAt(i);
            }

            System.out.println(cand);
        }
    }
}
