import java.util.*;
import java.io.*;

public class binserch {
    
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

            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int key = sc.nextInt();

            System.out.println(Binarysearch(a,0,n-1,key));
        }

        public static int Binarysearch(int a[],int l,int h, int key) {
            int mid = (l+h)/2;
            int index = -1;
            if (a[mid] == key) {
                index = mid;
            } else if (a[mid] > key) {
                index = Binarysearch(a, l, mid, key);
            } else {
                index = Binarysearch(a, mid+1, h, key);
            }

            return index;
        }
}
