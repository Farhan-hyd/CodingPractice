import java.util.*;
import java.io.*;

public class choclatemonger {
// incomplete
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

                while(testcase-- > 0) {
                    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
                    int n = sc.nextInt();
                    // int m = sc.nextInt();

                    int[] a = new int[n];

                    for(int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                        if(map.containsKey(a[i])) {
                            map.put(a[i], map.get(a[i]) + 1);
                        } else {
                            map.put(a[i], 1);
                        }    
                    }
                   
                }
            } catch (Exception e) {
                return;
            }
        }   
    
}