package babbar450.bitManipulation;

import java.io.*;
import java.util.*;

public class CountTotalBits {

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
        int two = 2, ans = 0;
        int n = sc.nextInt();
        int num = n;
        while (n != 0) {
          ans += (num / two) * (two >> 1);
          if ((num & (two - 1)) > (two >> 1) - 1) ans +=
            (num & (two - 1)) - (two >> 1) + 1;
          two <<= 1;
          n >>= 1;
        }
        System.out.println(ans);
      }
    } catch (Exception e) {
      return;
    }
  }
}
