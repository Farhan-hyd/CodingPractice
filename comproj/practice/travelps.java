import java.io.*;
import java.util.*;

public class travelps {
  
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

      public static void main(String[] args) throws IOException{
        try {
          
          FastReader sc = new FastReader();

          int testcase = sc.nextInt();

          while (testcase-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String str = sc.next();

            int result = 0;
            for (int i = 0; i < n; i++) {
              if (str.charAt(i) == '0') {
                result += a;
              } else {
                result += b;
              }
            }

            System.out.println(result);
          }

        } catch (Exception e) {
          return;
        }
      }
}
