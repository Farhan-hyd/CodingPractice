import java.util.*;
import java.io.*;

public class Chefquery {

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

                int n = sc.nextInt();
                int q = sc.nextInt();

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                while (q-- != 0) {
                    int type = sc.nextInt();

                    if (type == 1) {
                        int l = sc.nextInt();
                        int r = sc.nextInt();
                        int x = sc.nextInt();


                        for (int i = 0; i <r ; i++) {
                             a[i] += (int)Math.pow((x+i+1-l), 2);
                        }

                    } else {
                        int y = sc.nextInt();

                        System.out.println(a[y-1]);
                    }
                }
            } catch (Exception e) {
                return;
            }
        }
    
}
