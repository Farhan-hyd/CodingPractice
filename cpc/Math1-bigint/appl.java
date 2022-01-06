
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class appl {
    
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int testcase = sc.nextInt();

        while (testcase-- != 0) {
            BigInteger n = new BigInteger(sc.next());
            BigInteger k = new BigInteger(sc.next());

            solve(n, k);
        }
    }

    public static void solve(BigInteger n , BigInteger k) {
        
        BigInteger x,y;

        x = n.subtract(k);
        x = x.divide(BigInteger.valueOf(2));
        y = x.add(k);

        System.out.println(x);
        System.out.println(y);
    }
}
