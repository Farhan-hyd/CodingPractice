package cpc.Mathchallang;

import java.util.*;
import java.io.*;

public class birthdayparadox {

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

        float probablity = (float) sc.nextDouble();

        if (probablity >= 1) {

            System.out.println(365);

        } else {
            int people = (int) Math.sqrt(2 * 364 * Math.log(1 / (1 - probablity)));
            
            System.out.println(people+1);
        }

    }

}
