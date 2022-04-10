package babbar450.bitManipulation;

import java.util.*;
import java.io.*;

public class TwoNonRepeatingElements {
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
          for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
          }

          int xor = 0;
          for (int i = 0; i < n; i++) {
            xor ^= a[i];
          }
          xor &= -xor;
          int eleOne = 0, eleTwo = 0;
          for (int i = 0; i < n; i++) {
            if ((a[i] & xor) == 0) {
              eleOne ^= a[i];
            } else {
              eleTwo ^= a[i];
            }
          }
          int arr[] = {eleOne, eleTwo};
          Arrays.sort(arr);
          System.out.println(eleOne + " " + eleTwo);
        }
      } catch (Exception e) {
        return;
      }
    }  
}
