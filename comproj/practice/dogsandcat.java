import java.io.*;
import java.util.*;

public class dogsandcat {

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

            while (testcase-- > 0) {
                long cats = sc.nextLong();
                long dogs = sc.nextLong();
                long legs = sc.nextLong();

                long remainingLegs = legs - dogs * 4;

                if (remainingLegs >= 0 && remainingLegs % 4 == 0 && remainingLegs <= cats * 4
                        && remainingLegs >= (cats - 2 * dogs) * 4) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }

            }
        } catch (Exception e) {
            return;
        }
    }
}
