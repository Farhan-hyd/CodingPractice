package cpc.bitwisechal;

import java.util.*;
import java.io.*;

public class notsoesymat {

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

            int[] nos = { 2, 3, 5, 7, 11, 13, 17, 19 };

            System.out.println(nodivbyprime(nos, n));

        }
    }

    public static int nodivbyprime(int a[], int las) {

        int n = a.length;
        int result = 0;

        for (int i = 1; i < (1 << n); i++) {
            ArrayList<Integer> ar = filter(a, i);

            int size = ar.size();
            int prod = 1;

            for (int j = 0; j < ar.size(); j++) {
                prod *= ar.get(j);
            }

            int subdiv = las / prod;

            if ((size & 1) == 0) {
                subdiv *= -1;
            }

            result += subdiv;
        }

        return result;

    }

    public static ArrayList<Integer> filter(int a[], int n) {
        int j = 0;

        ArrayList<Integer> al = new ArrayList<>();

        while (n > 0) {
            int lastBit = (n & 1);

            if (lastBit == 1) {
                al.add(a[j]);
            }

            j++;
            n = n >> 1;
        }

        return al;

    }

}
