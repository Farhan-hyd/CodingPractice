import java.util.*;
import java.io.*;

public class maxXOR {

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

        long l = Long.parseLong(sc.next());
        long r = Long.parseLong(sc.next());

        System.out.println(maxxor(l, r));
    }

    public static long maxxor(long L, long R) {
        long LXR = L ^ R;

        int msbPos = 0;
        while (LXR > 0) {
            msbPos++;
            LXR >>= 1;
        }

        long maxXOR = 0;
        int two = 1;
        while (msbPos-- > 0) {
            maxXOR += two;
            two <<= 1;
        }

        return maxXOR;
    }

}
