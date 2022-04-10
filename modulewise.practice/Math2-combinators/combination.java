import java.util.Scanner;

public class combination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();

        System.out.println(combi(n, k));
        // System.out.println(catalan(n));

        sc.close();
    }

    public static long combi(Long n, long k) {
        long res = 1;
 
        if (k > n - k) {
            k = n - k;
        }
 
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
 
        return res;
    }

    public static long catalan(Long n) {
        return combi(2 * n, n) / (n + 1);
    }

    static int nCr(int n, int r){
        return fact(n) / (fact(r) *
                  fact(n - r));
    }

    static int fact(int n){
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }

}
