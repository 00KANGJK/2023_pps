import java.math.BigInteger;
import java.util.*;
public class A028_강준혁_20230713 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        A = A.add(B);
        System.out.println(A);

    }
}


