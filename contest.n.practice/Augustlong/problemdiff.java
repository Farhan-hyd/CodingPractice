import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class problemdiff {

    static class FastScanner{
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
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
            FastScanner sc = new FastScanner();
            int testcase = sc.nextInt();

            while (testcase-- > 0) {
                
                Set<Integer> uniqueQues = new HashSet<>();
                for (int i = 0; i < 4; i++) {
                    uniqueQues.add(sc.nextInt());
                }

                int unQue = uniqueQues.size();
                if (unQue == 1) {
                    System.out.println(0);
                } else if (unQue == 2) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
