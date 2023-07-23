import java.util.Scanner;

public class A094_강준혁_20230720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // ljes=njak
        String str = sc.next();
        System.out.println(solution(str));
    }
    public static int solution(String str) {
        String[] croAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String s : croAlpha)
            if(str.contains(s)) str = str.replaceAll(s, "*");
        return str.length();
    }
}