import java.io.*;
import java.util.*;

public class pvtele {

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

        System.out.println(findPivot(a, 0, n - 1));
    }

    public static int findPivot(int[] a, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = (s + e) / 2;
        if (mid < e && a[mid] > a[mid + 1]) {
            return mid;

        }
        if (s < mid && a[mid] < a[mid - 1]) {
            return mid - 1;
        }
        if (a[s] > a[mid]) {
            return findPivot(a, s, mid - 1);
        } else {
            return findPivot(a, mid + 1, e);
        }
    }
}
