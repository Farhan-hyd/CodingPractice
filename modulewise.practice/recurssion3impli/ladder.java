import java.io.*;
import java.util.*;

public class ladder {
    
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
            int k = sc.nextInt();

            System.out.println(fun(n, k));
        }

        public static int fun(int n,int k) {
            
            if (n==0) {
                return 1;
            }

            if (n<0) {
                return 0;
            }

            int ans = 0;
            for (int i = 1; i <= k; i++) {
                ans += fun(n-i, k);
            }

            return ans;
        }
}
