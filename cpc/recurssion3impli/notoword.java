package cpc.recurssion3impli;

import java.io.*;
import java.util.*;


public class notoword {
    
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

        public static Map<Integer,String> val = new HashMap<>();

        public static void main(String[] args) {
            
            FastReader sc = new FastReader();

            int n = sc.nextInt();
            print(n);

        }

        public static void print(int n) {
            val.put(0, "Zero");
            val.put(1, "One");
            val.put(2, "Two");
            val.put(3, "Three");
            val.put(4, "Four");
            val.put(5, "Five");
            val.put(6, "Six");
            val.put(7, "Seven");
            val.put(8, "Eight");
            val.put(9, "Nine");
            if(n == 0){
                return;
            }

            print(n/10);

            int las = n%10;
            System.out.print(val.get(las)+" ");

            return;
        }
}
