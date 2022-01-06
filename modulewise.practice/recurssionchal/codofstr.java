import java.io.*;
import java.util.*;

public class codofstr {

    public static ArrayList<String> ar = new ArrayList<>();

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
        String str = sc.next();
        String ans = "";

        printCodes(str, ans);
        System.out.print("[");
        for (int i = 0; i < ar.size(); i++) {
            if (i == ar.size() - 1) {
                System.out.print(ar.get(i));
            } else {
                System.out.print(ar.get(i) + ", ");
            }
        }
        System.out.print("]");
    }

    private static void printCodes(String str, String ans) {
        if (str.length() == 0) {
            ar.add(ans);
            return;
        }

        char ch1 = str.charAt(0);
        char code = (char) (ch1 - '1' + 'a');
        printCodes(str.substring(1), ans + code);

        if (str.length() >= 2 && ch1 <= '2') {
            int i = Integer.parseInt(str.substring(0, 2), 10);
            if (i > 0 && i <= 26) {
                code = (char) (i + 'a' - 1);
                printCodes(str.substring(2), ans + code);
            }
        }
    }
}
