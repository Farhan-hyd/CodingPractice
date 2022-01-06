package cpc.Mathchallang;

import java.io.*;
import java.util.*;

public class bostonno {

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
        int x = sc.nextInt();

        int factsum = Factsum(x);
        int digitsum = digitsum(x);

        if (factsum == digitsum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static int Factsum(int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        while (n % 2 == 0) {
            ar.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                ar.add(i);
                n /= i;
            }
        }

        int sum = 0;    
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        } 
        
        return sum;
    }

    public static int digitsum(int x) {
        int sum = 0;

        while (x != 0) {
            int lastdigit = x % 10;
            x /= 10;
            sum += lastdigit;
        }

        return sum;
    }

}
