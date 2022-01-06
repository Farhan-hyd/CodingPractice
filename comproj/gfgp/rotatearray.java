package comproj.gfgp;

import java.util.*;
import java.io.*;

class GFG {

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
        FastReader fr = new FastReader();

        int testcase = fr.nextInt();

        while (testcase-- > 0) {

            int n = fr.nextInt();
            int rot = fr.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = fr.nextInt();
            }

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[(i + rot) % n];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}
