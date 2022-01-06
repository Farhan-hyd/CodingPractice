import java.math.BigInteger;
import java.util.Scanner;

public class fact {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factorial(n));

        sc.close();

    }

    public static BigInteger factorial(int n) {

        BigInteger b = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        return b;
    }
}
