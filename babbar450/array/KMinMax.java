package babbar450.array;

import java.io.*;
import java.util.*;

public class KMinMax {
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

          for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
          }
          int k = sc.nextInt();

          Arrays.sort(a);
          System.out.println(a[k - 1] + " " + a[n-k -1]);

        }
      } catch (Exception e) {
        return;
      }
    }
}
