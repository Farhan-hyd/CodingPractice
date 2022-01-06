import java.util.*;
import java.io.*;

public class eita {

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
                int d = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();

                int s1 = x * 7;

                int s2 = (y * d) + (z * (7 - d));

                System.out.println(s1 > s2 ? s1 : s2);
            }

        } catch (Exception e) {
            return;
        }
    }
}
