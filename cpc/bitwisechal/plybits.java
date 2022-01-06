package cpc.bitwisechal;

import java.util.*;
import java.io.*;

public class plybits {
    
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

        while (testcase-->0) {
            
            int l = sc.nextInt();
            int h = sc.nextInt();

            int totalbit = countbit(l,h);

            System.out.println(totalbit);
        }
    }

    public static int countbit(int l , int h) {
        int totalbit = 0;

        for (int i = l; i <= h; i++) {
            totalbit += Integer.bitCount(i);
        }

        return totalbit;
    }

}
