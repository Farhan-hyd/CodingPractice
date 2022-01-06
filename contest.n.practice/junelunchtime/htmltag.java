import java.io.*;
import java.util.*;

public class htmltag {

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
                String s = sc.next();
                String ans = "Success";

                if (s.length() <= 3) {
                    ans = "Error";
                } else if (s.charAt(0) != '<' || s.charAt(1) != '/' || s.charAt(s.length() - 1) != '>') {
                    ans = "Error";
                } else if (s.charAt(s.length() - 1) != '>') {
                    ans = "Error";
                } else {
                    for (int i = 2; i < s.length()-1; i++) {
                        if (!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
                            ans = "Error";
                            break;
                        }
                    }
                }

                System.out.println(ans);
            }
        } catch (Exception e) {
            return;
        }
    }

}
