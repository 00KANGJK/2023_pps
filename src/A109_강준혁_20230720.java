import java.util.*;
import java.io.*;

public class A109_강준혁_20230720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // M : 벨트의 개수
        // a, b : 벨트로 이어진 두 바퀴의 회전수의 비
        // s : 벨트의 형태 (안꼬인 형태는 0, 꼬인 형태는 1)
        // r : 회전 방향 (시계방향은 true, 반시계방향은 false), 첫 시작은 시계방향
        // r_num : M+1번 바퀴의 분당 회전수
        int M, a = 1, b = 1, s, r_num = 1;
        boolean r = true;
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            r_num = (r_num / a) * b;
            r = s == 1 ? !r : r; // 꼬인 형태면 방향이 반대
        }

        if (r) {
            System.out.println("0 " + r_num);
        } else {
            System.out.println("1 " + r_num);
        }
    }
}
