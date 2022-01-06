import java.io.*;
import java.util.*;

public class flow006 {
    
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

                while(testcase-- > 0){
                    int n = sc.nextInt();
                    int sum = 0;

                    while(n != 0){
                        int lastdigit = n % 10;
                        n /= 10;
                        sum += lastdigit;
                    }

                    System.out.println(sum);
                }
                
            } catch (Exception e) {
                return;
            }
        }
}
