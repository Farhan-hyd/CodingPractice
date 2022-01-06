import java.io.*;
import java.util.*;

public class chfgcd {

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

            int testcase = sc.nextInt();

            while (testcase-- != 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (gcd(x, y) > 1) {
                    System.out.println(0);
                } else if (gcd(x + 1, y) > 1 || gcd(x, y + 1) > 1) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }

            }
        } catch (Exception e) {
            return;
        }
    }

    public static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        }

        return gcd(y % x, x);
    }
}
