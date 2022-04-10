package codevita.mokevitaone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Palindrome {
  
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

        int strLength = sc.nextInt();
        String str = sc.nextLine();
        int setsize = sc.nextInt();
        String[] setlen = sc.nextLine().split(" ");
        
        int[] set = new int[setlen.length];
        for (int i = 0; i < setlen.length; i++) {
          set[i] = Integer.parseInt(setlen[i]);
        }

        int[] getPalingrome = new int[strLength];
        

      } catch (Exception e) {
        return;
      }
    }

    private static boolean isPalindrome(String str) {
      int start =0;
      int end = str.length()-1;

      while (start < end) {
        if (str.charAt(start) != str.charAt(end)) {
          return false;
        }
      }

      return true;
    }
}
