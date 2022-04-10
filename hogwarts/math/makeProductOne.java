package hogwarts.math;

import java.io.*;
import java.util.*;

public class makeProductOne {
  
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
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
          arr[i] = sc.nextInt();
        }
        int zeroCount = 0;
        int negativeCount = 0;
        int step = 0;
        for (int i = 0; i < n ; i++) {
          if (arr[i] == 0) {
            zeroCount++;
          } else if (arr[i] > 0) {
            step += arr[i] - 1;
          } else {
            negativeCount++;
            step += -1 - arr[i];
          }
        }

        if (negativeCount % 2 == 0 || zeroCount != 0) {
          step += zeroCount;
        } else {
          step += 2;
        }
        System.out.println(step);
      } catch (Exception e) {
        return;
      }
    }
}
