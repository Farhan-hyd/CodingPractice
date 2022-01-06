import java.util.*;
import java.io.*;

public class quicksort {

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

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        quickSort(a, 0, n - 1);
        printArray(a, n);
    }

    static void quickSort(int[] a, int l, int h) {
        if (l < h) {

            int pi = partition(a, l, h);

            quickSort(a, l, pi - 1);
            quickSort(a, pi + 1, h);
        }
    }

    static int partition(int[] a, int l, int h) {

        int pivot = a[h];

        int i = (l - 1);

        for (int j = l; j <= h - 1; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, h);
        return (i + 1);
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }
}
