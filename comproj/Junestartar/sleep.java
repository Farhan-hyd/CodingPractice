package comproj.Junestartar;

import java.util.*;
import java.io.*;

public class sleep {
    
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
                
                FastReader sc = new FastReader();

                int testcase = sc.nextInt();

                while (testcase-- != 0) {
                    int l = sc.nextInt();

                    int[] a = new int[l];

                    for (int i = 0; i < a.length; i++) {
                        a[i] = sc.nextInt();
                    }

                    for (int i = 0; i < a.length; i++) {
                    }

                    
                }
            } catch (Exception e) {
                return;
            }
        }
}
