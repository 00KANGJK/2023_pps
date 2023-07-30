import java.util.Scanner;

public class A113_강준혁_20230724 {
    static int n, m;
    static int arr[][];
    static boolean visit[];
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        scanner.close();

        // If not visited, run DFS
        for (int i = 1; i < n + 1; i++) {
            if (!visit[i]) {
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int num) {
        visit[num] = true;
        for (int i = 1; i < n + 1; i++) {
            if (!visit[i] && arr[num][i] == 1) {
                dfs(i);
            }
        }
    }
}
