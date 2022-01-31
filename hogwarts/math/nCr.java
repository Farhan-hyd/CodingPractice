package hogwarts.math;

import java.io.*;
import java.util.*;

public class nCr {
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
        long m = 1000000007;
        int n = sc.nextInt();
        long[] fact = new long[n+1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
          fact[i] = (fact[i-1]%m * (long) i%m) %m;
        }
        System.out.println(fact[n]);
      } catch (Exception e) {
        return;
      }
    }  
}