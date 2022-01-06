import java.util.*;
import java.io.*;

public class tavsad {

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

        int prevdigit = luckydig(n) + 1;
        int tatdig = tatdig(n);

        System.out.println(prevdigit + tatdig);
    }

    public static int luckydig(int n) {

        int i = 0;

        while (n >= 10) {
            n /= 10;
            i++;
        }


        int sum =((int) (Math.pow(2, i+1)) - 2);

        return sum;
    }

    private static int tatdig(int n) {
        int tatsol = 0;
        int i = 0;

        while (n != 0) {
            int lasdig = n % 10;

            if (lasdig == 7) {
                tatsol += (int) Math.pow(2, i);
            }

            n /= 10;
            i++;
        }

        return tatsol;
    }
}
