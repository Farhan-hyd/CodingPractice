import java.io.*;
import java.util.*;

public class maxaxor {

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

        public static void main(String[] args) throws IOException {
            try {

                FastReader sc = new FastReader();

                int testcase = sc.nextInt();

                while (testcase-- > 0) {
                    int n = sc.nextInt();
                    int k = sc.nextInt();

                    Long exp = (long) Math.pow(2, n);
                    Long ans = Math.min(2*k, exp) * (exp - 1);
                    
                    System.out.println(ans);
                }
                
            } catch (Exception e) {
                return;
            }
        }
    
}