import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class noofsteps {

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

  public static void main(String[] args) {
    try {
      FastReader fastReader = new FastReader();
        int n = fastReader.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
          a[i] = fastReader.nextInt();
          if (a[i] < min) {
            min = a[i];
          }
        }
        for (int i = 0; i < n; i++) {
          b[i] = fastReader.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
          if (a[i] >= b[i]) {
            int diff = a[i] - min;
            if (diff == 0) {
              continue;
            } else if (b[i] > diff) {
              count = -1;
              break;
            } else {
              count += diff/b[i];
            }
          } else {
            count = -1;
            break;
          }
        }
        System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
