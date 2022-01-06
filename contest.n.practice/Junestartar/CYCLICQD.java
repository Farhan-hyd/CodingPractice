import java.util.*;
import java.io.*;

public class CYCLICQD {

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
                
                FastReader sc= new FastReader();

                int testcase = sc.nextInt();

                while (testcase-- != 0) {
                    int A = sc.nextInt();
                    int B = sc.nextInt();
                    int C = sc.nextInt();
                    int D = sc.nextInt();

                    int s1 = A + C;
                    int s2 = B + D;

                    if (s1 == 180 && s2 == 180) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            } catch (Exception e) {
                return;
            }
            
        }
    
}