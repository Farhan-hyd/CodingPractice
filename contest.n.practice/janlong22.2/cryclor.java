import java.util.*;
import java.io.*;

public class cryclor {
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
        int[] boxOne = new int[3];
        int[] boxTwo = new int[3];
        int[] boxThree = new int[3];
        for (int i = 0; i < 3; i++) {
          boxOne[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
          boxTwo[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
          boxThree[i] = sc.nextInt();
        }
        if (boxOne[0] == n && boxTwo[1] == n && boxThree[2] == n) {
          System.out.println(0);
        } 
        int swap1 = boxOne[1] + boxOne[2] + boxTwo[2];
        int swap2 = boxTwo[0] + boxThree[0] + boxThree[1];
        int maxSwap = Math.max(swap1, swap2);
        System.out.println(maxSwap);
      }
    } catch (Exception e) {
      return;
    } 
  } 
}