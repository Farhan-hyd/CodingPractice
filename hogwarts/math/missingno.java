package hogwarts.math;

import java.io.*;
import java.util.*;

public class missingno {

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
  
        int n = sc.nextInt();
        int arrXor = 0;
        int xor = n;
        for (int i = 0; i < n ; i++) {
          arrXor ^= sc.nextInt();
          xor ^= i;
        }
        System.out.println(xor ^ arrXor);
      } catch (Exception e) {
        return;
      }
    }
}