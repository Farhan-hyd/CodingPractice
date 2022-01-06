import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcdandlcm {   
    
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

            while (testcase-- > 0) {
                Long num1 = sc.nextLong();
                Long num2 = sc.nextLong();

                Long gcd = gcd(num1, num2);
                Long lcm = lcm(num1, num2, gcd);

                System.out.println(gcd+" "+lcm);
            }
            
        } catch (Exception e) {
            return;
        }
    }

    static long gcd(Long a, long b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    static long lcm(Long a, Long b, long gcd){
        return (a / gcd) * b;
    }
}
