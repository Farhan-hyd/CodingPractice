package cpc.stlchallange;

import java.util.*;
import java.io.*;

public class subarrdis {

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

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(sumoflength(a, n));

    }

    public static int sumoflength(int[] arr, int n) {
        Set<Integer> s = new HashSet<>();

        int j = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && !s.contains(arr[j])) {
                s.add(arr[i]);
                j++;
            }

            ans += ((j - i) * (j - i + 1)) / 2;

            s.remove(arr[i]);
        }

        return ans;
    }

}
