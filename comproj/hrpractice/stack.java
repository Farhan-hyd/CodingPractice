package comproj.hrpractice;

import java.io.*;
import java.util.*;

public class stack {
    
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

            Stack<Integer> st = new Stack<>();

            int query = sc.nextInt();

            while (query-- != 0) {
                int type = sc.nextInt();

                if (type == 1) {
                    int n = sc.nextInt();
                    st.push(n);
                } else if (type == 2) {
                    st.pop();
                } else {
                    System.out.println();
                }
            }
        } catch (Exception e) {
            return;
        }
    }

   
}