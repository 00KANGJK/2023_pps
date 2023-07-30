import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class A002_강준혁_20230727 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            if (i > 0) {
                List<Integer> prevRow = pascalsTriangle.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                row.add(1);
            }
            pascalsTriangle.add(row);
        }
        return pascalsTriangle;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = in.nextInt();

        Solution solution = new Solution();
        System.out.println("Output: " + solution.generate(numRows));

        in.close();
    }
}
