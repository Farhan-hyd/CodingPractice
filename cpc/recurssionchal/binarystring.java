package cpc.recurssionchal;

import java.io.*;
import java.util.*;

public class binarystring {

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
            int n = sc.nextInt();
            System.out.println(countStr(n+1));
        }
    }

    public static long countStr(int n) {
        long[][] T = new long[n+1][2];
 
        T[1][0] = 1;
        T[1][1] = 1;
 
        for (int i = 2; i <= n; i++){
            T[i][0] = T[i-1][0] + T[i-1][1];
 
            T[i][1] = T[i-1][0];
        }
 
        return T[n][0];
    }
}
