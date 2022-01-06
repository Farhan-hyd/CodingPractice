import java.util.*;
import java.io.*;

public class sumitup {

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
        Vector<Integer> a = new Vector<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a);
        int t = sc.nextInt();

        Vector<Integer> temp = new Vector<Integer>();

        combination(0, 0, t, temp, a);

    }

    public static void combination(int l, int sum, int t, Vector<Integer> temp, Vector<Integer> a) {

        if (sum == t) {
            for (int i = 0; i < temp.size(); i++) {
                if (i != 0)
                    System.out.print(" ");
                System.out.print(temp.get(i));
            }
            System.out.println();
            return;
        }

        for (int i = l; i < a.size(); i++) {
            if (sum + a.get(i) > t)
                continue;

            if (i > l && a.get(i) == a.get(i - 1))
                continue;

            temp.add(a.get(i));

            combination(i + 1, sum + a.get(i), t, temp, a);

            temp.remove(temp.size() - 1);
        }
    }
}
