package babbar450.array;


import java.util.*;
import java.io.*;

public class UnionAndIntersection {
  
  static class FastReader {
      BufferedReader br;
      StringTokenizer st;
  
      public FastReader() throws FileNotFoundException {
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
          int m = sc.nextInt();

          int a[] = new int[n];
          for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
          }
          System.out.println(a.length);
          int b[] = new int[m];
          for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
          }
          System.out.println(b.length);
          ArrayList<Integer> union = getUnion(a, b);
          System.out.println(union.size());
          ArrayList<Integer> intersection = getIntersection(a, b); 
          for (int i : union) {
            System.out.print(i + " ");
          }
          System.out.println();
          for (int i : intersection) {
            System.out.print(i + " ");
          }
          System.out.println();
        }
      } catch (Exception e) {
        return;
      }
    }
    
    private static ArrayList<Integer> getIntersection(int[] a, int[] b) {
      ArrayList<Integer> intersection = new ArrayList<>();
      int aPointer = 0;
      int bPointer = 0;

      while (aPointer < a.length && bPointer < b.length) {
        if (a[aPointer] == b[bPointer]) {
          intersection.add(a[aPointer]);
          aPointer++;
          bPointer++;
        } else if (a[aPointer] < b[bPointer]) {
          aPointer++;
        } else {
          bPointer++;
        }
      }
      return intersection;
    }

    private static ArrayList<Integer> getUnion(int[] a, int[] b) {
      ArrayList<Integer> union = new ArrayList<>();
      int aPointer = 0;
      int bPointer = 0;

      while (aPointer < a.length && bPointer < b.length) {
        if (a[aPointer] == b[bPointer]) {
          union.add(a[aPointer]);
          aPointer++;
          bPointer++;
        } else if (a[aPointer] < b[bPointer]) {
          union.add(a[aPointer]);
          aPointer++;
        } else {
          union.add(b[bPointer]);
          bPointer++;
        }
      }

      while (aPointer <= a.length  && bPointer == b.length) {
        union.add(a[aPointer]);
        aPointer++;
      }

      while (bPointer < b.length && aPointer == a.length) { 
        union.add(b[bPointer]);
        bPointer++;
      }

      return union;
    }
}
