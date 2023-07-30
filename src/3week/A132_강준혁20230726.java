import java.util.Scanner;

public class A132_강준혁_20230726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        int x1, y1, r1, x2, y2, r2;
        double d;

        for (int i = 0; i < T; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();

            d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2)
                    sb.append(-1 + "\n");
                else
                    sb.append(0 + "\n");
            } else {
                if (r1 + r2 < d || (r1 - r2) * (r1 - r2) > d * d)
                    sb.append(0 + "\n");
                else if (r1 + r2 == d || (r1 - r2) * (r1 - r2) == d * d)
                    sb.append(1 + "\n");
                else if ((r1 - r2) * (r1 - r2) < d * d && d * d < (r1 + r2) * (r1 + r2))
                    sb.append(2 + "\n");
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
