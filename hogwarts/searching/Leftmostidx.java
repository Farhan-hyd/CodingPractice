package hogwarts.searching;

import java.io.*;
import java.util.*;

public class Leftmostidx {
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
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int firstacc = -1,lastacc = -1;
        for (int i = 0, j = n-1; i > j ; i++, j--) {
          if (arr[i] == element && firstacc == -1) {
            firstacc = i; 
          }
          if (arr[j] == element && lastacc == -1) {
            lastacc = j;
          }
        }
        if (firstacc == -1) {
          System.out.println(element+" is not present");
        } else if (firstacc == lastacc) {
          System.out.println(firstacc);
        } else {
          System.out.println("range:"+firstacc+" to "+lastacc);
        }
      } catch (Exception e) {
        return;
      }
    }
}
