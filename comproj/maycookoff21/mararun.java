package comproj.maycookoff21;

import java.util.*;
import java.io.*;

public class mararun {

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

        int testcase =sc.nextInt();

        while (testcase-- != 0) {
            
            int D = sc.nextInt();
            int d = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int total = D * d;

            if (total >= 42) {
                System.out.println(C);
            } else if (total >= 21) {
                System.out.println(B);
            } else if (total >= 10) {
                System.out.println(A);
            } else {
                System.out.println(0);
            }
        }
        
    }
}
