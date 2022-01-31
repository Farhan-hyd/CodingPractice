import java.util.*;
import java.io.*;

public class tilling {

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
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.println(countWays(n, m));
            }
        } catch (Exception e) {
            return;
        }
    }

    public static int countWays(int n, int m) { 
        int[] count = new int[n + 1];
        count[0] = 0; 
   
        int i; 
        for (i = 1; i <= n; i++) { 
            if (i > m) 
                count[i] = count[i - 1] + count[i - m]; 
   
            else if (i < m) 
                count[i] = 1; 
  
            else
                count[i] = 2; 
        } 
        return count[n]; 
    } 
}