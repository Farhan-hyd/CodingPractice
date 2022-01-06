import java.util.*;
import java.io.*;

public class CEILSUM {
    
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

                while (testcase-- != 0) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    if (a == b) {
                        System.out.println(0);
                    } else if (b > a) {
                        long sum = (b-a)/2;
                        System.out.println(sum+1);
                    } else {
                        if ((a-b) % 2 == 0) {
                            long sum = (b-a)/2;
                            System.out.println(sum+1);
                        } else {
                            long sum = (b-a)/2;
                            System.out.println(sum);
                        }
                    }
                }
            } catch (Exception e) {
                return;
            }
        }
}
