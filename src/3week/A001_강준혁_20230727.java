import java.util.Arrays;
import java.util.Scanner;

class A001_강준혁_20230727 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex = 0;
        int cookieIndex = 0;

        while (childIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[childIndex]) {
                childIndex++;
            }
            cookieIndex++;
        }

        return childIndex;
    }

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of children: ");
        int numChildren = in.nextInt();
        int[] g = new int[numChildren];
        System.out.print("Enter the greed factors for each child: ");
        for (int i = 0; i < numChildren; i++) {
            g[i] = in.nextInt();
        }

        System.out.print("Enter the number of cookies: ");
        int numCookies = in.nextInt();
        int[] s = new int[numCookies];
        System.out.print("Enter the sizes for each cookie: ");
        for (int i = 0; i < numCookies; i++) {
            s[i] = in.nextInt();
        }

        System.out.println("Output: " + findContentChildren(g, s));

        in.close();
    }
}