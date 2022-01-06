package comproj.hrpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class favsubsequence {

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
          FastReader fr = new FastReader();
          String s = fr.nextLine();
          int a = 0;
          int b = 0;
          int c = 0;
          for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
              a = (1 + 2 * a);
            } else if (s.charAt(i) == 'b') {
              b = (a + 2 * b);
            } else {
              c = (b + 2 * c);
            }
          }
          System.out.println(c);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
  
}
