import java.util.*;
import java.io.*;

public class VISA {

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
        FastReader sc = new FastReader();
        
        int testcase = sc.nextInt();

        while (testcase-- !=0) {
            
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int z1 = sc.nextInt();
            int z2 = sc.nextInt();

            boolean x = valid(x1, x2);
            boolean y = valid(y1, y2);
            boolean z = validZ(z1, z2);

            if (x && y && z) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean valid(int x1,int x2) {
        return (x2>=x1)?true:false;
    }

    public static boolean validZ(int x1,int x2) {
        return (x1>=x2)?true:false;
    }
}
