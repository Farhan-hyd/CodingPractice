package babbar450.array;

import java.util.*;
import java.io.*;

public class MoveAllNegetive {

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

          int left = 0;
          int right = n - 1;
          while (left < right) {
            if (a[left] < 0) {
              left++;
            } else if (a[right] >= 0) {
              right--;
            } else {
              int temp = a[left];
              a[left] = a[right];
              a[right] = temp;
            }
          }
          
          for (int i : a) {
            System.out.print(i + " ");
          }
        }
      } catch (Exception e) {
        return;
      }
    }
}