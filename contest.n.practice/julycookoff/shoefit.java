import java.io.*;
import java.util.*;

public class shoefit {
    
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
                    int a[] = new int[3];

                    int one =0 ;
                    int zero =0 ;

                    for (int i = 0; i < 3; i++) {
                        a[i] = sc.nextInt();
                        if (a[i] == 1) {
                            one++;
                        } else {
                            zero++;
                        }
                    }

                    if(one >= 1 && zero >= 1) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
            } catch (Exception e) {
                return;
            }
        }

}
