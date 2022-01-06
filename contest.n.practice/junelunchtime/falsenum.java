import java.util.*;
import java.io.*;

public class falsenum {

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
                StringBuffer A = new StringBuffer(sc.next());

                if (Character.getNumericValue(A.charAt(0)) == 1) {
                    A.insert(1, 0);
                } else {
                    A.insert(0, 1);
                }

                System.out.println(A);
            }
        } catch (Exception e) {
            return;
        }
    }
}
