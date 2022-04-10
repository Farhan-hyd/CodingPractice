import java.io.*;
import java.util.*;

public class riffles {

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
        Long n = sc.nextLong();
        Long k = sc.nextLong();
        if (n < 4) {
          System.out.println("1 2");
          continue;
        }
        long temp;
        long c = 1;
        long a = (n / 2) + 1;

        while (a != 2) {
          if (a % 2 == 1) 
            a = a / 2 + 1;
          else 
            a = n / 2 + a / 2;
          c++;
        }

        k = k % c;
        long k2 = 1;

        for (long i = 1; i <= k; i++) {
          k2 <<= 1;
          k2 %= (n - 1);
        }

        for (long i = 0; i < n / 2; i++) {
          temp = ((k2 * i) % (n - 1) + 1) % (n - 1);
          if (temp == 0) 
            System.out.print(n - 1 + " "); 
          else 
            System.out.print(temp + " ");
        }

        for (long i = -(n / 2) + 1; i < 0; i++) {
          temp = ((k2 * i) % (n - 1) + n) % (n - 1);
          if (temp == 0) 
            System.out.print(n - 1 + " ");
          else 
            System.out.print(temp + " ");
        }
        System.out.println(n);
      }
    } catch (Exception e) {
      return;
    }
  }
}
