package comproj.spybits;



import java.util.*;
import java.io.*;

public class savwater {
    
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
                    int h = sc.nextInt();
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int c = sc.nextInt();

                    System.out.println(h*(x+(y/2)) <= c ? "Yes" : "No");
                }
            } catch (Exception e) {
                return;
            }
        }
}
