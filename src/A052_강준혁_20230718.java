import java.util.Scanner;

public class A052_강준혁_20230718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String OX = null;
        int score = 0;

        for(int i=0; i<N; i++) {
            int count = 0;
            score = 0;
            OX = sc.next();
            for(int j=0; j<OX.length(); j++) {
                if(OX.charAt(j)=='O') {
                    count++;
                    score = score + count;
                } else if (OX.charAt(j)=='X') {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}