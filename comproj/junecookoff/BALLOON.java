package comproj.junecookoff;

import java.util.*;
import java.io.*;

public class BALLOON {

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
        
        int testcase = sc.nextInt();

        while (testcase-- !=0) {
            int n = sc.nextInt();
            int res = 0;

            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = n-1; i != 0; i--) {
                if(a[i]<8){
                    res = i;
                    break;
                }
            }

            System.out.println(res+1);
        }    
    }

}