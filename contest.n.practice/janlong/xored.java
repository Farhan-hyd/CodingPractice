import java.io.*;
import java.util.*;

public class xored {

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

        if (n == 1) {
          System.out.println(x);
          continue;
        }

        if (n == 2) {
          System.out.println(x + " 0");
          continue;
        }

        int[] answer = new int[n];
        if (x >= 262144) { /* it is value of 2^18*/
          answer[0] = 262144;
        } else {
          answer[0] = 0;
        }

        int xor = answer[0] ^ x;

        for (int i = 1; i <= n - 2; i++) {
          answer[i] = i;
          xor ^= i;
        }

        answer[n - 1] = xor;

        if (answer[n - 1] == 0) {
          answer[n - 1] += 131072; /* it is value of 2^17*/ 
          answer[1] += 131072;
        } else if (answer[n - 1] <= n) {
          answer[0] += 131072;
          answer[n - 1] += 131072;
        }

        for (int i : answer) {
          System.out.print(i + " ");
        }
        System.out.println();
      }
    } catch (Exception e) {
      return;
    }
  }
}
