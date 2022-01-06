package cpc.recurssionchal;

import java.io.*;
import java.util.*;

public class friendpairingproblem {

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

                int n = sc.nextInt();

                System.out.println(ways(n));
            }
        } catch (Exception e) {
            return;
        }
    }

    public static long ways(int n) {

        if(n <= 2) return n;
        return ways(n-1) + ((n-1)*ways(n-2));
    }
}
