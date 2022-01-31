import java.util.*;
import java.io.*;

public class uniqueno3 {
    
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(Uniqueno(a));

    }

    public static int Uniqueno(int[] a){
        int ones = 0, twos = 0 ,n = a.length;
        int mask;
 
        for (int i = 0; i < n; i++) {
            twos = twos | (ones & a[i]);
            ones = ones ^ a[i];
            mask = ~(ones & twos);
 
            ones &= mask;
 
            twos &= mask;
        }
        
        return ones;
    }

}
