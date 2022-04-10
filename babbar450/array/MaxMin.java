package babbar450.array;

import java.io.*;
import java.util.*;

public class MaxMin {
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
          long a[] = new long[n];
          long min = Long.MAX_VALUE;
          long max = Long.MIN_VALUE;

          for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] < min) {
              min = a[i];
            }
            if (a[i] > max) {
              max = a[i];
            }
          }

          System.out.println(max + " " + min);
        }
      } catch (Exception e) {
        return;
      }
    }
}
