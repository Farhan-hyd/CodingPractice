import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class catalanno {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) throws IOException {
        try {

            FastReader sc = new FastReader();

            long n = sc.nextInt();

            System.out.println(catalan(n));

        } catch (Exception e) {
            return;
        }
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

    public static BigInteger catalan(Long n) {
        BigInteger b = new BigInteger("1");
 
        for (int i = 1; i <= n; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
 
        b = b.multiply(b);
 
        BigInteger d = new BigInteger("1");
 
        for (int i = 1; i <= 2 * n; i++) {
            d = d.multiply(BigInteger.valueOf(i));
        }
 
        BigInteger ans = d.divide(b);
 
        ans = ans.divide(BigInteger.valueOf(n + 1));
        
        return ans;
    }
}
