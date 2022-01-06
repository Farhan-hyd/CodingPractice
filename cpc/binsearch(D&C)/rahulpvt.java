import java.io.*;
import java.util.*;

public class rahulpvt {

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
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(find(arr, n, key));

    }

    public static int find(int a[], int n, int key) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int m = (s + e) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[s] <= a[m]) {
                if (key >= a[s] && key <= a[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (key >= a[m] && key <= a[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }

        return -1;

    }
}
