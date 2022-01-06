import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class bigint {

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

        // FastReader sc = new FastReader();

        BigInteger b1 = new BigInteger("1786325813653");
        BigInteger b2 = new BigInteger("1");
        BigInteger b3= new BigInteger("6");
        // BigInteger b4 = new BigInteger(sc.next());
      
        b2 = b2.add(b1);
        System.out.println(b2);

        b3 = b3.multiply(b1);
        System.out.println(b3);

        System.out.println(b1.bitCount()); //setbit
        System.out.println(b1.bitLength()); //totalbit

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // BigInteger b4 = BigInteger.valueOf(a);
        // BigInteger b5 = BigInteger.valueOf(b);
        // System.out.println(b4.gcd(b5));

        BigInteger b6= new BigInteger("11101101",2);
        System.out.println(b6);

        System.out.println(b1.pow(8));
    }   
    
}