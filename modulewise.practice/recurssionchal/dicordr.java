import java.util.*;
import java.io.*;

public class dicordr {

    public static HashSet<String> hs = new HashSet<>();

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
        PriorityQueue<String> pq = new PriorityQueue<>();

        FastReader sc = new FastReader();
        String in = sc.next();

        permutation(in, 0);
        for (String string : hs) {
            pq.add(string);
        }

        boolean done = false;
        for (String string : pq) {
            if (done) {
                System.out.println(string);
            }
            if (string.equals(in)) {
                done = true;
            }
        }
    }

    public static void permutation(String in, int i) {
        if (in.isEmpty()) {
            return;
        }

        for (int j = i; j < in.length(); j++) {
            in = swapChars(in, i, j);
            hs.add(in);
            permutation(in, i + 1);
            in = swapChars(in, i, j);
        }
    }

    private static String swapChars(String str, int lIdx, int rIdx) {
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(lIdx), r = sb.charAt(rIdx);
        sb.setCharAt(lIdx, r);
        sb.setCharAt(rIdx, l);
        return sb.toString();
    }
}
