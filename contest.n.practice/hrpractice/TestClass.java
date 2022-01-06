import java.util.*;
import java.io.*;

class TestClass {
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

    public static void main(String args[]) throws Exception {
        
        FastReader fastReader = new FastReader();
        int testClass = fastReader.nextInt();

        while(testClass-- > 0){
            int n = fastReader.nextInt();
            int k = fastReader.nextInt();
            int idx = n - (k%n);
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = fastReader.nextInt();
            }

            for (int i = idx; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}