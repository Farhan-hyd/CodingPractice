import java.util.*;
import java.io.*;

class Strocc {

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

    // Function to print the string
    static void printStringAlternate(String str) {
        int[] occ = new int[122];

        String s = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char temp = s.charAt(i);

            occ[temp]++;

            if (occ[temp] % 2 != 0)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        FastReader fs = new FastReader();
        int testcases = fs.nextInt();

        while (testcases-- != 0 ) {

            String s = fs.nextLine();
            printStringAlternate(s);
            
        }
    }
}
