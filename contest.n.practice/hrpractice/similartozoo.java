import java.util.*;
import java.io.*;

public class similartozoo {

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

public static void main(String args[] ) throws Exception {
try{
    String str = (new FastReader()).nextLine();
    int x = str.indexOf('o');
    int y = str.length() - x;  
    System.out.println(2*x == y? "Yes" : "No");
} catch (Exception e) {
    e.printStackTrace();
}

}
  
}
