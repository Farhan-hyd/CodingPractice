import java.util.*;
import java.io.*;

public class biltz2_3 {
    
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

        public static void main(String[] args) throws IOException{
            
            try {
                
                FastReader sc= new FastReader();

                int testcase = sc.nextInt();

                while (testcase-- != 0) {
                    int n = sc.nextInt();
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    
                    int res = 2 * (180 + n ) - a - b;
                    System.out.println(res);
                }

            } catch (Exception e) {
                return;
            }
        }
}
