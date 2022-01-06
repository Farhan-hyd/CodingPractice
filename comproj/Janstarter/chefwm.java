import java.io.*;
import java.util.*;

public class chefwm {
  
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
        double n = sc.nextDouble();
        double m = sc.nextDouble();

        if (n%2 == 0) {
          n = Math.floor(n/3);
        } else {
          n = (n/2) + 1.5;
        }

        if (m%2 == 0) {
          m = Math.floor(m/2);
        } else {
          m = (m/2) + 0.5;
        }

        long ans = (long) (n*m);
        System.out.println(ans);
      }
    } catch (Exception e) {
      return;
    }
  }
}
