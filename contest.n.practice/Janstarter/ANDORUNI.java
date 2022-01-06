import java.io.*;
import java.util.*;

public class ANDORUNI {
  
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }

        // storing bit values of number in ans array
        int[] ans = new int[32];
        for (int i = 0; i < n; i++) {
          int temp = arr[i];
          for (int j = 0; j < 32; j++) {
            if ((temp & 1) == 1) {
              ans[j]++;
            }
            temp = temp >> 1;
          }
        }

        // convering bit values array asn to string in reverse order
        String ansstr = "";
        for (int i = 0; i < ans.length; i++) {
          if (ans[i] > 1) {
            ansstr = "1" + ansstr;
          } else {
            ansstr = "0" + ansstr;
          }
        }

        int ansint = Integer.parseInt(ansstr, 2);
        System.out.println(ansint);
      }
    } catch (Exception e) {
      return;
    }
  }
}