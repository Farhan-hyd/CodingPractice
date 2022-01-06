import java.io.*;
import java.util.*;

public class chefgrd {

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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int diff = n - x  + n - y;
        if (diff % 2 == 0) {
          System.out.println(0);
        } else {
          System.out.println(1);
        }
      }
    } catch (Exception e) {
      return;
    }
  }
}
