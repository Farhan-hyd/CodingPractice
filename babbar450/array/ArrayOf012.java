package babbar450.array;

import java.io.*;
import java.util.*;

public class ArrayOf012 {
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
          int a[] = new int[n];
          int zeroCnt=0,oneCnt=0;
          for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 0) {
              zeroCnt++;
            } else if (a[i] == 1) {
              oneCnt++;
            } 
          }

          for (int i = 0; i < n; i++) {
            if (zeroCnt != 0) {
              a[i] = 0;
              zeroCnt--;
            } else if (oneCnt != 0) {
              a[i] = 1;
              oneCnt--;
            } else {
              a[i] = 2;
            }
          }
        }
      } catch (Exception e) {
        return;
      }
    }  
}
