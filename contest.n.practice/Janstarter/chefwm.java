import java.io.*;
import java.util.*;

// incomplete
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

        int pf = 0;
        
        for (int i = 2; i * i <= m; i++) {
          if (m % i == 0) {
            pf++;
            while (m % i == 0) {
              m /= i;
            }
          }
        }
        if (m != 1) {
          pf++;
        }
        
        int ans = 0;
        for (int i = pf; i > 0; i--) {
          if (n % i == 0 ) {
            ans = i;
            break;
          }
        }

        System.out.println(ans);
      }
    } catch (Exception e) {
      return;
    }
  }
}
