import java.io.*;
import java.util.*;

public class powsum {
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
          int sum = 0;
          int min = Integer.MAX_VALUE;
          int minIndx = -1;
          int a[] = new int[n];

          for (int i = 0; i < n; i++) {
              a[i] = sc.nextInt();
              if (min > a[i]) {
                min = a[i];
                minIndx = i;
              }
              sum += a[i];
          }

          sum -= min;
          int m = power(sum);
          int c = (m - sum) / min;
          
          if (c == 1) {
            System.out.println(0);
          } else {
            System.out.println(1);
            System.out.println("1 "+c);
            System.out.println(minIndx+1);
          } 
        }
      } catch (Exception e) {
        return;
      }
    }

    static int power(int sum){
      sum--;
      while ((sum&sum-1)!=0) {
        sum &= sum-1;
      }
      return sum << 1;
    }
}
