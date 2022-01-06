import java.util.*;
import java.io.*;

public class ultrafastmaths {

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
            String a = sc.next();
            String b = sc.next();
            
            int A = Integer.parseInt(a,2);
            int B = Integer.parseInt(b,2);
            String xor = Integer.toBinaryString(A^B);
            
            int len = xor.length();
            int s = a.length();

            String ans = "";

            for (int i = 0; i < s - len; i++) {
                ans += "0";
            }
            ans += xor;

            System.out.println(ans);
        }
    }
}
